package assignments;

import java.util.Scanner;

public class Cryptography {
    private static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {

        int data = input("Enter a four digit number:");
        int firstDigit = data/1000;
        int secondDigit = (data%1000)/100;

        int thirdDigit  = (data % 100)/10;

        int fourthDigit = (data % 10);

        firstDigit = encrypt(firstDigit);

        secondDigit = encrypt(secondDigit);

        thirdDigit = encrypt(thirdDigit);

        fourthDigit = encrypt(fourthDigit);


        System.out.printf("The encrypted data is %d%d%d%d",thirdDigit,fourthDigit,firstDigit,secondDigit);
    }

    public static  int encrypt(int digit){
        return (digit + 7)%10;
    }
    public static void display(String message){
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scan.nextInt();
    }
}
