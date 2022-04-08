package chapterFourteen;

import java.util.Scanner;

public class CreatingThreeLetterStringFromFiveLetterWord {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String userInput = input("Enter the five letter word: ");
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static String input(String message){
        display(message);
        return scanner.nextLine();
    }
}
