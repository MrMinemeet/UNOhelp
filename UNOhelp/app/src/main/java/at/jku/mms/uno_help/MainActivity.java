package at.jku.mms.uno_help;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;

import java.util.List;

import at.jku.mms.uno_help.Cards.Card;

public class MainActivity extends AppCompatActivity {

    private CodeScanner codeScanner;

    public static final Player player = new Player();
    public static Card topCard = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create pop-up for name input
        player.setName(this);

        // Try to get CodeScannerView from activity_main
        CodeScannerView scannerView = findViewById(R.id.scanner_view);

        // Setup code scanner
        codeScanner = new CodeScanner(this, scannerView);

        // Set callback when a code was read/decoded
        codeScanner.setDecodeCallback(result -> runOnUiThread(() -> {
            // Set decoded text into TextView
            String qrCodeIdentifier = result.getText();
            Card card = Card.createFromQRCode(qrCodeIdentifier);
            topCard = card;

            // Create dialog in which the user has to confirm if this is the correct card
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            String message = R.string.current_card_is + "\n" + card.toString();
            alertDialogBuilder.setMessage(message);

            // Shows player dialog to select what to do with scanned card
            alertDialogBuilder.setPositiveButton(R.string.show_possible_cards,
                (DialogInterface.OnClickListener) (arg0, arg1) -> {
                    // Player selected the option to show possible cards

                    List<Card> possibleCards = GameLogic.getPossibleCards(player, card);
                    if(possibleCards.size() < 1) {
                        // No possible cards where found in deck
                        Toast.makeText(this, R.string.no_possible_cards, Toast.LENGTH_LONG).show();
                    } else {
                        // User has some possible cards
                        Intent i = new Intent(MainActivity.this, PossibleCardsDisplay.class);
                        startActivityForResult(i, 0);
                    }
                    // Reactivate scanning
                    codeScanner.startPreview();
                });

            // Player adds card to deck
            alertDialogBuilder.setNegativeButton(R.string.add_card_to_deck,
                (DialogInterface.OnClickListener) (arg0, arg1) -> {
                    // Player selected the option to add card to deck
                    player.addToDeck(card);
                    Toast.makeText(MainActivity.this, R.string.added_card_to_deck, Toast.LENGTH_SHORT).show();
                    codeScanner.startPreview();
                });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }));
    }

    @Override
    protected void onResume() {
        super.onResume();
        codeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        codeScanner.releaseResources();
        super.onPause();
    }
}