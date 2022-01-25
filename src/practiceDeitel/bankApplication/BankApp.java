package practiceDeitel.bankApplication;

public class BankApp {

    private String phoneNumber;
    private String accountName;
    private double balance;

    public BankApp(String accountName, String phoneNumber) {
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double depositAmount) {
        if (depositAmount <= 0){
            this.balance = 0;
        }
        else {
            this.balance += depositAmount;
        }

    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount < 0){
            withdrawalAmount = 0;
        }
        else {
            this.balance -= withdrawalAmount;
        }

    }

}
