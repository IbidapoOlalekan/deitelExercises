package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class TokenWordsStartingWithB {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = input("Enter a sentence and press Enter: ");
        String[] tokens = sentence.split(" ");
        checkIfTokensStartWithB(tokens);
    }

    private static void checkIfTokensStartWithB(String[] tokens) {
        for (String token : tokens) {
            display(token.toUpperCase());
            display(token.toLowerCase());
            boolean isTokenStartWithB = token.startsWith("b");
            if (isTokenStartWithB){
                display(token);
            }
            boolean isTokenEndsWithEd = token.endsWith("ED");
            if (isTokenEndsWithEd){
                display(token);
            }
        }
    }

    public static String input(String message){
        display(message);
        return scanner.nextLine();
    }

    private static void display(String message) {
        System.out.println(message);
    }
}
