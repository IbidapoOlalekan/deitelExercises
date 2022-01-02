package chapterSix;

import java.util.Scanner;

public class ReversingDigits {
private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        display("Enter A Number: ");
        int userInput = scan.nextInt();

        int reverse = reverse(userInput);

        System.out.println("The reversed number is " +reverse);
    }

    public static int reverse(int number){
        int reverse = 0;
        while (number !=  0 ){
            int remainder = number % 10;
           reverse = reverse * 10 + remainder;
           number = number / 10;

        }

        return reverse;
    }

    public static void display(String message){
        System.out.println(message);
    }
}
