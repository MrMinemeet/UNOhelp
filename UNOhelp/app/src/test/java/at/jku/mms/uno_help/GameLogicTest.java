package at.jku.mms.uno_help;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import at.jku.mms.uno_help.Cards.Card;
import at.jku.mms.uno_help.Cards.CardColor;
import at.jku.mms.uno_help.Cards.CardType;

import static org.junit.Assert.*;

public class GameLogicTest {
    
    private Player player = new Player();
    

    @Test
    public void testGetPossibleCards() {
        player = new Player();
        List<Card> deck = new ArrayList<>();

        // TODO: Use "createFromQRCode" instead of constructor
        Card blue5 = new Card(CardType.FIVE, CardColor.BLUE);
        Card blue9 = new Card(CardType.NINE, CardColor.BLUE);
        Card red1 = new Card(CardType.ONE, CardColor.RED);
        Card green5 = new Card(CardType.FIVE, CardColor.GREEN);
        Card colorSwitch = new Card(CardType.COLOR_SWITCH, CardColor.SPECIAL);
        deck.add(blue9);
        deck.add(red1);
        deck.add(green5);
        deck.add(colorSwitch);

        player.setCurrentDeck(deck);

        List<Card> possibleDeck = GameLogic.getPossibleCards(player, blue5);

        assertEquals(3, possibleDeck.size());
        assertTrue(possibleDeck.contains(blue9));
        assertTrue(possibleDeck.contains(green5));
        assertTrue(possibleDeck.contains(colorSwitch));
    }
}