package chapterTwo;

import java.util.Scanner;

public class OddOrEven {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int number = input("Enter a message:  ");

        if(number % 2 == 0){
            display("The number is even");
        }
        else {
            display("The number is odd");
        }
    }

    public static int input(String message){
        display(message);
        return scan.nextInt();
    }

    public static String display(String message){
        System.out.println(message);
        return message;
    }
}
