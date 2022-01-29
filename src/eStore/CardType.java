package eStore;

import chapterFour.ControlStructure;

public enum CardType {
    MC("MASTER CARD"),
    VC("VISA CARD"),
    V("VERVE"),
    AE("AMERICAN EXPRESS");

    private final String cardType;
    CardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardType() {
        return cardType;
    }
}
