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
     * @param qrCodeIdentifier Identifying string to card. E.g "R1" for 1 in color red
     * @return Card object which holds the configured card
     */
    public static Card createFromQRCode(String qrCodeIdentifier) {
        // TODO: Create cases for all cards

        switch(qrCodeIdentifier){
            case "R1":
                return new Card(CardType.ONE, CardColor.GREEN);
            default:
                return null;
        }
    }
}
