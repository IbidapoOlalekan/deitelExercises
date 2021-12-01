package chapterSix;

public class Bank {
    public static void main(String[] args) {
        Account increaseAccount = new Account("Increase Lois");
        Account mjAccount = new Account("Mary Jane Okoroafor");

        System.out.println("Increase initial balance is " + increaseAccount.checkBalance());
        System.out.println("Mary Jane initial balance is " + mjAccount.checkBalance());

        increaseAccount.withdraw(45_000);
        increaseAccount.deposit(2_000);

        System.out.println("Increase initial balance is " + increaseAccount.checkBalance());
        System.out.println("Mary Jane initial balance is " + mjAccount.checkBalance());
    }
}
