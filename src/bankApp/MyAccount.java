package bankApp;

public class MyAccount {
    private String name;
    private String pin;
    private int balance = 50_000;

    public MyAccount(String name, String accountNeedle) {
        this.name = name;
        pin = accountNeedle;
    }



    public String getAccountName() {
        return name;
    }

    public int getBalance(String pin) {
        return balance;
    }

    public void deposit(int depositAmount) {
        if (depositAmount > 0){
            balance = balance + depositAmount;
        }



    }

    public void withdraw(String pin, int withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
        }


    }


    public void setPin(String pin) {
        this.balance = balance;
    }
}
