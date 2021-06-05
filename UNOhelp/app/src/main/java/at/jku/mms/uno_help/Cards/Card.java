package at.jku.mms.uno_help.Cards;

import android.graphics.drawable.Drawable;

import at.jku.mms.uno_help.R;

public class Card {
    /* Properties of cards
        E.g.: Enum - cardType, color
             String name - QR code
     */

    private final CardType cardType;
    private final CardColor cardColor;
    private int cardImage = 0;

    private Card(CardType type, CardColor color) {
        this.cardType = type;
        this.cardColor = color;

        //sets cardImage depending on cardType and cardColor
        if(cardType == CardType.ZERO) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_0_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_0_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_0_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_0_card;
            }
        } else if(cardType == CardType.ONE) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_1_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_1_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_1_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_1_card;
            }
        } else if(cardType == CardType.TWO) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_2_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_2_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_2_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_2_card;
            }
        } else if(cardType == CardType.THREE) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_3_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_3_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_3_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_3_card;
            }
        } else if(cardType == CardType.FOUR) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_4_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_4_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_4_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_4_card;
            }
        } else if(cardType == CardType.FIVE) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_5_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_5_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_5_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_5_card;
            }
        } else if(cardType == CardType.SIX) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_6_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_6_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_6_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_6_card;
            }
        } else if(cardType == CardType.SEVEN) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_7_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_7_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_7_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_7_card;
            }
        } else if(cardType == CardType.EIGHT) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_8_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_8_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_8_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_8_card;
            }
        } else if(cardType == CardType.NINE) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_9_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_9_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_9_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_9_card;
            }
        } else if(cardType == CardType.DIRECTION_SWITCH) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_change_direction_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_change_direction_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_change_direction_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_change_direction_card;
            }
        } else if(cardType == CardType.TAKE_TWO) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_plus2_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_plus2_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_plus2_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_plus2_card;
            }
        } else if(cardType == CardType.PLAYER_LOCK) {
            if(cardColor == CardColor.BLUE) {
                cardImage = R.drawable.blue_expose_card;
            } else if (cardColor == CardColor.GREEN) {
                cardImage = R.drawable.green_expose_card;
            } else if(cardColor == CardColor.RED) {
                cardImage = R.drawable.red_expose_card;
            } else if(cardColor == CardColor.YELLOW) {
                cardImage = R.drawable.yellow_expose_card;
            }
        } else if(cardType == CardType.COLOR_SWITCH) {
            cardImage = R.drawable.wish_card;
        } else if(cardType == CardType.TAKE_FOUR_COLOR_SWITCH) {
            cardImage = R.drawable.wish_plus4_card;
        } else {
            cardImage = 0;
        }
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

    public int getCardImage() {
        return cardImage;
    }

    /**
     * Creates a card object from QR-Code Identifier
     * @param qrCodeIdentifier Identifying string to card. E.g "red1" for 1 in color red
     * @return Card object which holds the configured card
     * @throws IllegalArgumentException Exception is thrown if card type could not be identified
     */
    public static Card createFromQRCode(String qrCodeIdentifier) throws IllegalArgumentException {

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
