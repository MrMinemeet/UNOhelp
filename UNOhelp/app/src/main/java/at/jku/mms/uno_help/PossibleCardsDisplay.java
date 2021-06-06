package at.jku.mms.uno_help;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import at.jku.mms.uno_help.Cards.Card;

public class PossibleCardsDisplay extends AppCompatActivity {

    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_possible_cards_display);

        player = MainActivity.player;
        List<Card> possibleCards = GameLogic.getPossibleCards(player, MainActivity.topCard);

        TableLayout tl = findViewById(R.id.tableLayout);

        int countCard = 0;
        TableRow tr = new TableRow(this);

        //go through all possible Cards
        for(Card card : possibleCards) {
            //check if row is full (only three cards a allowed in a row)
            if(countCard % 3 == 0) {
                //produce a new row
                tr = new TableRow(this);
                tl.addView(tr);
            }

            //produce new button
            ImageButton ib = new ImageButton(this);
            ib.setTag(card);
            ib.setImageResource(card.getCardImage());

            //remove card from deck
            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Card c = (Card)v.getTag();
                    player.removeFromDeck(c);
                    finishActivity(0);
                }
            });

            //add new button to the row
            tr.addView(ib);
            countCard++;
        }
    }
}