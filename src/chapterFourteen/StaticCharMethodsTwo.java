package chapterFourteen;

import java.util.Scanner;

public class StaticCharMethodsTwo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int radix = input("Please Enter A Radix");

        System.out.printf("Please Choose one:%n1 -- %s%n2 -- %s%n","Convert Digit To Character","Convert Character To Digit");

        int userChoice = scanner.nextInt();

        convert(radix, userChoice);
    }

    private static void convert(int radix, int userChoice) {
        switch (userChoice) {
            case 1 -> {
                int digit = input("Enter a digit: ");
                System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit, radix));
            }
            case 2 -> {
                display("Enter A Character: ");
                char character = input();
                System.out.printf("Convert character to digit: %s%n", Character.digit(character, radix));
            }
        }
    }

    public static void display(String message){
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scanner.nextInt();
    }

    public static char input(){
        return scanner.next().charAt(0);
    }
}
