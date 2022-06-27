package chapterFourteen;

import java.util.Scanner;

public class TokenizingPhoneNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String phoneNumber = input("Enter a phone number: ");

        String[] tokens = phoneNumber.split("[()\\s\\-]");
        for (String token : tokens)
            System.out.print(token);

    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static void displayOneLine(String message){
        System.out.print(message);
    }

    public static String input(String message){
        display(message);
        return scanner.nextLine();
    }
}
