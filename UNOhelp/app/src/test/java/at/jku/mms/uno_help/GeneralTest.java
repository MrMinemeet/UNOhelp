package at.jku.mms.uno_help;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import at.jku.mms.uno_help.Cards.Card;
import at.jku.mms.uno_help.Cards.CardColor;
import at.jku.mms.uno_help.Cards.CardType;

import static org.junit.Assert.*;

public class GeneralTest {
    
    private Player player = new Player();

    @Test
    public void testcreateFromQRCode() {
        Card blue5 = Card.createFromQRCode("blue5");
        Card blue9 = Card.createFromQRCode("blue9");
        Card red1 = Card.createFromQRCode("red1");
        Card green5 = Card.createFromQRCode("green5");
        Card colorSwitch = Card.createFromQRCode("color_switch");

        assertEquals(CardColor.BLUE, blue5.getCardColor());
        assertEquals(CardType.FIVE, blue5.getCardType());
        assertEquals(CardColor.BLUE, blue9.getCardColor());
        assertEquals(CardType.NINE, blue9.getCardType());
        assertEquals(CardColor.RED, red1.getCardColor());
        assertEquals(CardType.ONE, red1.getCardType());
        assertEquals(CardColor.GREEN, green5.getCardColor());
        assertEquals(CardType.FIVE, green5.getCardType());
        assertEquals(CardColor.SPECIAL, colorSwitch.getCardColor());
        assertEquals(CardType.COLOR_SWITCH, colorSwitch.getCardType());
    }
    

    @Test
    public void testGetPossibleCards() {
        player = new Player();
        List<Card> deck = new ArrayList<>();

        // TODO: Use "createFromQRCode" instead of constructor
        Card blue5 = Card.createFromQRCode("blue5");
        Card blue9 = Card.createFromQRCode("blue9");
        Card red1 = Card.createFromQRCode("red1");
        Card green5 = Card.createFromQRCode("green5");
        Card colorSwitch = Card.createFromQRCode("color_switch");
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