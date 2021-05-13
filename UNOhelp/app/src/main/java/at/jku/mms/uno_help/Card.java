package at.jku.mms.uno_help;

public class Card {
    /* Eigenschaften für Karte
        Bsp: Enun - Kartentyp
             String name - QR code
     */

    private final CardType cardType;
    private final CardColor cardColor;
    private final String qrCodeName;

    public Card(CardType type, CardColor color, String qrCodeName) {
        this.cardType = type;
        this.cardColor = color;
        this.qrCodeName = qrCodeName;
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

    public String getQrCodeName() {
        return qrCodeName;
    }
}
