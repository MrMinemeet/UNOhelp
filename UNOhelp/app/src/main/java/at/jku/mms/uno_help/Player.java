package at.jku.mms.uno_help;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.jku.mms.uno_help.Cards.Card;

public class Player {
    private String name;
    private ArrayList<Card> currentDeck = new ArrayList<>();

    // Constructors
    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public Player(Card... deck) {
        currentDeck = new ArrayList<>(Arrays.asList(deck));
    }


    /**
     * Creates dialog for entering username
     * @param c Current context
     */
    public void setName(Context c) {
        final EditText taskEditText = new EditText(c);
        AlertDialog dialog = new AlertDialog.Builder(c)
                .setTitle(R.string.player_name_title)
                .setMessage(R.string.player_name_text)
                .setView(taskEditText)
                .setPositiveButton(R.string.submit, (dialog1, which) -> {
                    String name = String.valueOf(taskEditText.getText());
                    Toast.makeText(c, "Name: " + name, Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton(R.string.cancel, null)
                .create();
        dialog.show();
    }

    public ArrayList<Card> getCurrentDeck() {
        return currentDeck;
    }
    public void setCurrentDeck(List<Card> newDeck) {
        this.currentDeck = new ArrayList<>(newDeck);
    }

    /**
     * Adds given card to players deck
     * @param newCard Card that gets added
     */
    public void addToDeck(Card newCard){
        currentDeck.add(newCard);
    }
}
