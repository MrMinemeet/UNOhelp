package at.jku.mms.uno_help.Cards;

public class Card {
    /* Properties of cards
        E.g.: Enum - cardType, color
             String name - QR code
     */

    private final CardType cardType;
    private final CardColor cardColor;

    public Card(CardType type, CardColor color) {
        this.cardType = type;
        this.cardColor = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == this.getClass()) {
            Card other = (Card)obj;
            return other.getCardColor() == this.getCardColor() && other.getCardType() == this.getCardType();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Card Color: " + this.getCardColor() + " - Card Type: " + this.getCardType();
    }

    // Getter
    public CardType getCardType() {
        return cardType;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    /**
     * Creates a card object from QR-Code Identifier
     * @param qrCodeIdentifier Identifying string to card. E.g "red1" for 1 in color red
     * @return Card object which holds the configured card
     * @throws IllegalArgumentException Exception is thrown if card type could not be identified
     */
    public static Card createFromQRCode(String qrCodeIdentifier) throws IllegalArgumentException {
        // TODO: Create cases for all cards

        CardColor cardColor = null;
        CardType cardType = null;

        // Get Color from Identifier
        if(qrCodeIdentifier.contains("blue")) {
            cardColor = CardColor.BLUE;
        } else if(qrCodeIdentifier.contains("green")) {
            cardColor = CardColor.GREEN;
        } else if(qrCodeIdentifier.contains("red")) {
            cardColor = CardColor.RED;
        } else if(qrCodeIdentifier.contains("yellow")) {
            cardColor = CardColor.YELLOW;
        } else {
            cardColor = CardColor.SPECIAL;
        }

        // Get Type from Identifier
        if (qrCodeIdentifier.contains("0")) {
            cardType = CardType.ZERO;
        } else if(qrCodeIdentifier.contains("1")) {
            cardType = CardType.ONE;
        } else if(qrCodeIdentifier.contains("2")) {
            cardType = CardType.TWO;
        } else if(qrCodeIdentifier.contains("3")) {
            cardType = CardType.THREE;
        } else if(qrCodeIdentifier.contains("4")) {
            cardType = CardType.FOUR;
        } else if(qrCodeIdentifier.contains("5")) {
            cardType = CardType.FIVE;
        } else if(qrCodeIdentifier.contains("6")) {
            cardType = CardType.SIX;
        } else if(qrCodeIdentifier.contains("7")) {
            cardType = CardType.SEVEN;
        } else if(qrCodeIdentifier.contains("8")) {
            cardType = CardType.EIGHT;
        } else if(qrCodeIdentifier.contains("9")) {
            cardType = CardType.NINE;
        } else if(qrCodeIdentifier.contains("direction_switch")) {
            cardType = CardType.DIRECTION_SWITCH;
        } else if(qrCodeIdentifier.contains("player_lock")) {
            cardType = CardType.PLAYER_LOCK;
        } else if(qrCodeIdentifier.contains("take_two")) {
            cardType = CardType.TAKE_TWO;
        } else if(qrCodeIdentifier.contains("take_four_color_switch")) {
            cardType = CardType.TAKE_FOUR_COLOR_SWITCH;
        } else if(qrCodeIdentifier.contains("color_switch")) {
            cardType = CardType.COLOR_SWITCH;
        }


        if(cardType == null) {
            throw new IllegalArgumentException("Card type could not be identified");
        }

        return new Card(cardType, cardColor);
    }
}
