package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int accountNumber = input("Enter the Account Number");

        int balance = input("Enter the balance: ");

        int totalCharge = input("Enter the charges: ");

        int totalCredit = input("Enter the credit: ");

        int creditLimit= input("Enter the credit limit: ");

        int newBalance  = balance  + totalCharge - totalCredit;

        check(creditLimit, newBalance);
    }

    private static void check(int creditLimit, int newBalance) {
        boolean isCreditLimitExceeded = newBalance > creditLimit;
        if (isCreditLimitExceeded){
            display("Credit Limit Exceeded");
        }
        else {
            System.out.printf("The new balance is %d", newBalance);
        }
    }

    public static int input(String message){
        display(message);
       return input.nextInt();
    }

    public static void display(String message){
        System.out.println(message);
    }
}
