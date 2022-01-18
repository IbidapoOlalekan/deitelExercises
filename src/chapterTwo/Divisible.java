package chapterTwo;

import java.util.Scanner;

public class Divisible {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int number = input("Enter A Number: ");

        boolean numberIsDivisibleBy3 = number % 3 == 0;

        if (numberIsDivisibleBy3){
            System.out.printf("%d is divisible by three",number);
        }
        else {
            System.out.printf("%d is not divisible by three",number);
        }
    }

    public  static int input(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
}
