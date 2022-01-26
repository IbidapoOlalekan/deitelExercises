package chapterFour;

import java.util.Scanner;

public class SwitchCase {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayPrompt();
        int userChoice = scanner.nextInt();
        select(userChoice);
    }

    private static void select(int userChoice) {
        switch (userChoice) {
            case 1 -> display("I speak English");
            case 2 -> display("I speak Yoruba");
            case 3 -> display("I speak Igbo");
            case 4 -> display("I speak Hausa");
            case 5 -> display("I speak Edo");
            default -> display("Abeg get sense");
        }
    }

    private static void displayPrompt() {
        String prompt = """
                For English press 1
                        For Yoruba press 2
                For Igbo Press 3
                            For Hausa Press 4
                For Edo Press 5
                """;

        display(prompt);
    }

    public static void display(String message){
        System.out.println(message);
    }
}
