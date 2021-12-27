package chapterSix;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number Or Any Negative Number To Quit");
        int userInput = scan.nextInt();
        while (userInput >= 0){
          boolean result =   evenOrOdd(userInput);
            System.out.println(result);
            System.out.println("Enter A Number Or Any Negative Number To Quit");
            userInput = scan.nextInt();
        }
    }

    public static boolean evenOrOdd(int number){
        if (number % 2 == 0){
            return true;
        }
        else
            return false;
    }
}
