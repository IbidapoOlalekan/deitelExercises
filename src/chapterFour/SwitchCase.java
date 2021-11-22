package chapterFour;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String prompt = """
                For English press 1
                        For Yoruba press 2
                For Igbo Press 3
                            For Hausa Press 4
                For Edo Press 5
                """;

        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int userchoice = scanner.nextInt();

        switch (userchoice) {
            case 1 -> System.out.println("I speak English");
            case 2 -> System.out.println("I speak Yoruba");
            case 3 -> System.out.println("I speak Igbo");
            case 4 -> System.out.println("I speak Hausa");
            case 5 -> System.out.println("I speak Edo");
            default -> System.out.println("Abeg get sense");
        }
    }
}
