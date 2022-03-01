package practiceDeitel.dollars;

public abstract class Money {
    abstract Money times(int multiplier);
    protected String currency;
    protected int amount;
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
    protected String currency(){
        return currency;
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
}
