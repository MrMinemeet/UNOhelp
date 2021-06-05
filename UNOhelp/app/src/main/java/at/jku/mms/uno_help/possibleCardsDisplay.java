package at.jku.mms.uno_help;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import at.jku.mms.uno_help.Cards.Card;

public class possibleCardsDisplay extends AppCompatActivity {

    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_possible_cards_display);

        player = MainActivity.player;
        List<Card> possibleCards = GameLogic.getPossibleCards(player, MainActivity.topCard);

        TableLayout tl = findViewById(R.id.tableLayout);

        TableRow tr = new TableRow(this);
        tl.addView(tr);

        ImageButton ib = new ImageButton(this);
        ib.setImageResource(R.drawable.blue_0_card);

        tr.addView(ib);
    }
}