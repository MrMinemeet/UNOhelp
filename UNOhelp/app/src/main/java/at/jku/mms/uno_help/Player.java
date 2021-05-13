package at.jku.mms.uno_help;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

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



    public void setName(Context c) {
        final EditText taskEditText = new EditText(c);
        AlertDialog dialog = new AlertDialog.Builder(c)
                .setTitle(R.string.player_name_title)
                .setMessage(R.string.player_name_text)
                .setView(taskEditText)
                .setPositiveButton(R.string.submit, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String name = String.valueOf(taskEditText.getText());
                        Toast.makeText(c, "Name: " + name, Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .create();
        dialog.show();
    }
}
