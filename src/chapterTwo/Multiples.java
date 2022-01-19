package chapterTwo;

import java.util.Scanner;

public class Multiples {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int numberOne = input("Enter A Number: ");

        int numberTwo = input("Enter A Number: ");

        boolean numberOneIsAMultipleOfNumberTwo = numberOne % numberTwo ==0;

        if(numberOneIsAMultipleOfNumberTwo){
            System.out.printf("%d is a multiple of %d",numberOne,numberTwo);
        }
        else
            display("It is not a multiple!!!!");
    }

    public static int input(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public static String display(String message){
        System.out.println(message);
        return message;
    }


}