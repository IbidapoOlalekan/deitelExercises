package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class TokenWordsStartingWithB {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = input("Enter a sentence and press Enter: ");
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            System.out.println(token.toUpperCase());
            System.out.println(token.toLowerCase());
            if (token.startsWith("b")){
                System.out.println(token);
            }
            if (token.endsWith("ED")){
                System.out.println(token);
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
