package practiceDeitel;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        display("Enter a Number: ");
        int userInput = scan.nextInt();
        checkNumber(userInput);
    }
    public static void checkNumber(int number){
        if (number > 0) display("Positive");
        else if (number < 0) display("Negative");
        else display("The number was Zero");

    }
    public static void display(String message){
        System.out.println(message);
    }
}
