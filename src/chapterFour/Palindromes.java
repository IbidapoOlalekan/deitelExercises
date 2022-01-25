package chapterFour;

import java.util.Scanner;

public class Palindromes {
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        int num =input("Enter five digit number: ");

        display(palindrome(num));
    }

    public static void display(String message){
        System.out.println(message);
    }
    public static String palindrome(int number){

        int firstDigit = number / 10000;
        int secondDigit = (number % 10000)/1000;

        int fourthDigit = (number % 100)/10;
        int fifthDigit = (number % 10);


        if (fifthDigit == firstDigit & fourthDigit == secondDigit){
            return "It is a palindrome";
        }
        return "It is not a palindrome!!!";
    }

    public static int input(String message){
        display(message);
        return userInput.nextInt();
    }


}
