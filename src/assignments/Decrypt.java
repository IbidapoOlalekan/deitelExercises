package assignments;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Decrypt {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int encrypted = input("Enter encrypted data: ");

        int firstDigit = encrypted / 1000;
        int secondDigit = (encrypted % 1000)/100;
        int thirdDigit = (encrypted % 100)/10;
        int fourthDigit = (encrypted % 10);

      firstDigit = decrypt(firstDigit);

      secondDigit = decrypt(secondDigit);

      thirdDigit = decrypt(thirdDigit);

      fourthDigit = decrypt(fourthDigit);

        System.out.printf("The decrypted data is %d%d%d%d",thirdDigit,fourthDigit,firstDigit,secondDigit);

    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scan.nextInt();
    }
                                                                                                                     
    public static int decrypt(int userInput){
        if (userInput >= 7){
            return userInput - 7;
        }
        else {
            return (userInput + 10) - 7;
        }
    }
}
