package chapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        display("Enter a five digit number: ");
        int num = userInput.nextInt();

        display(palindrome(num));
    }
    public static void display(String message){
        System.out.println(message);
    }
    public static String palindrome(int number){

        int firstDigit = number / 10000;
        int secondDigit = (number % 10000)/1000;
        int thirdDigit = (number % 1000)/100;
        int fourthDigit = (number % 100)/10;
        int fifthDigit = (number % 10);


        if (fifthDigit == firstDigit & fourthDigit == secondDigit){
            return "It is a palindrome";
        }
        return "It is not a palindrome!!!";
    }


}
