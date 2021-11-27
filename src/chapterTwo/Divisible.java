package chapterTwo;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0){
            System.out.printf("%d is divisible by three",number);
        }
        else {
            System.out.printf("%d is not divisible by three",number);
        }
    }
}
