package chapterFourteen;

import java.util.Scanner;

public class TokenizeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter: ");
        String sentence = scanner.nextLine();

        String[]tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%n The tokens are: %n",tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
