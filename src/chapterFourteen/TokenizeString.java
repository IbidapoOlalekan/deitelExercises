package chapterFourteen;

import java.util.Scanner;

public class TokenizeString {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = input("Enter a sentence and press Enter: ");
        String[]tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%n The tokens are: %n",tokens.length);
        for (String token : tokens) {
            display(token);
        }
    }

    public static void display(String message){
        System.out.println(message);
    }
    public static String input(String message){
        display(message);
        return scanner.nextLine();
    }
}
