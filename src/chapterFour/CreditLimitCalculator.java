package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int accountnumber = input.nextInt();
        System.out.println("Enter the balance: ");
        int balance = input.nextInt();
        System.out.println("Enter the charges: ");
        int totalCharge = input.nextInt();
        System.out.println("Enter the credit: ");
        int totalCredit = input.nextInt();
        System.out.println("Enter the credit limit: ");
        int creditLimit= input.nextInt();

        int newBalance  = balance  + totalCharge - totalCredit;
        if (newBalance > creditLimit){
            System.out.println("Credit Limit Exceeded");
        }
        else {
            System.out.printf("The new balance is %d",newBalance);
        }
    }
}
