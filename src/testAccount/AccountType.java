package testAccount;

public enum AccountType {
    SAVINGS(0.25),
    CURRENT(0.01),
    TEENS(2.3);

    private final double interestRate;
    AccountType(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
