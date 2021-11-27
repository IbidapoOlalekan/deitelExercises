package assignments;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int data = scan.nextInt();
        int firstDigit = data/1000;
        int secondDigit = (data%1000)/100;

        int thirdDigit  = (data % 100)/10;

        int fourthDigit = (data % 10)/1;

        firstDigit = (firstDigit + 7)%10;

        secondDigit =(secondDigit + 7)%10;

        thirdDigit = (thirdDigit + 7)%10;

        fourthDigit = (fourthDigit + 7)%10;


        System.out.printf("The encrypted data is %d%d%d%d",thirdDigit,fourthDigit,firstDigit,secondDigit);
    }
}
