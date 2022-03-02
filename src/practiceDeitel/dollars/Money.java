package practiceDeitel.dollars;

public class Money implements Expression {

    protected String currency;
    protected int amount;
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
    protected String currency(){
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }
    static Money franc(int amount){
        return new Franc(amount,"CHF");
    }

    Money times(int multiplier){
        return  new Money(multiplier * amount, currency);
    }

    Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}
