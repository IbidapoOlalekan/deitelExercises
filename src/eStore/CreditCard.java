package eStore;

import java.time.LocalDate;

public class CreditCard {
    private String cardCvv;
    private LocalDate cardExpirationYear;
    private LocalDate cardExpirationMonth;
    private String creditCardNumber;
    private String creditCardName;
    private CardType cardType;

    public CreditCard(String cardCvv, String creditCardName, String creditCardNumber, CardType cardType){
        this.cardCvv = cardCvv;
        this.creditCardName = creditCardName;
        this.creditCardNumber = creditCardNumber;
        this.cardType = cardType;
    }
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardType getCardType() {
        return cardType;
    }
}
