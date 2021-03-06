package chapterFour;

import java.util.Scanner;

public class PrivacyWithCryptography {
    private static final Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {

        int data = input("Enter a four digit number: ");
      String encryptedData =  encrypt(data);

        display(encryptedData);
    }

    public static String encrypt(int data){
        int firstDigit = data/1000;
        int secondDigit = (data%1000)/100;

        int thirdDigit  = (data % 100)/10;

        int fourthDigit = (data % 10);

        firstDigit = (firstDigit + 7)%10;

        secondDigit =(secondDigit + 7)%10;

        thirdDigit = (thirdDigit + 7)%10;

        fourthDigit = (fourthDigit + 7)%10;

        return String.format("The encrypted data is %d%d%d%d",thirdDigit,fourthDigit,firstDigit,secondDigit);
    }

    public static void display(String message){
        System.out.println(message);
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }
}
