package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("Enter a number: ");
        int numbertwo = scan.nextInt();

        if (number > numbertwo) {
            System.out.printf("%d is larger", number);
        } else {
            if (number == numbertwo) {
                System.out.printf("These numbers are equal");
            } else {
                System.out.printf("%d is larger", numbertwo);
            }
        }
    }
}

