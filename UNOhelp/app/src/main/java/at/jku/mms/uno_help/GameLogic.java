package at.jku.mms.uno_help;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import at.jku.mms.uno_help.Cards.Card;
import at.jku.mms.uno_help.Cards.CardColor;

public class GameLogic {
    public static List<Card> getPossibleCards(Player player, Card currentTopCard){

        // List that holds possible cards
        List<Card> possibleCards = new ArrayList<>();

        for(Card card : player.getCurrentDeck()) {
            // Check for each card in deck
            if(card.getCardType() == currentTopCard.getCardType()) {
                // Same card type
                possibleCards.add(card);
            } else if(card.getCardColor() == currentTopCard.getCardColor()) {
                // Same card color
                possibleCards.add(card);
            } else if(card.getCardColor() == CardColor.SPECIAL) {
                // Special card (eg. Take 4 color change, Color change
                possibleCards.add(card);
            }
        }

        return Collections.unmodifiableList(possibleCards);
    }
}
