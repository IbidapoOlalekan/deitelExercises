package chapterSix;

public class Account {
    private String accountName;
    private int balance;

    public Account(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String newName) {
        accountName = newName;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public int checkBalance(){
        return balance;
    }



}
