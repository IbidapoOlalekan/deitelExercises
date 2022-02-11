package chapterSix;

import java.util.Scanner;

public class EvenOrOdd {
    private static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput =  input("Enter A Number or Any Negative Number To Quit");
        checkIfOddOrEven(userInput);
    }

    private static void checkIfOddOrEven(int userInput) {
        while (userInput >= 0){
          boolean result =   evenOrOdd(userInput);
            display(result);
            display("Enter A Number Or Any Negative Number To Quit");
            userInput =  input("Enter A Number or Any Negative Number To Quit");
        }
    }

    public static boolean evenOrOdd(int number){  
        boolean isNumberDivisibleByTwo = number % 2 == 0;
        if (isNumberDivisibleByTwo){
            return true;
        }
        else
            return false;
    }

    public static void display(String message){
        System.out.println(message);
    }
    public static void display(int message){
        System.out.println(message);
    }
    public static void display(Boolean message){
        System.out.println(message);
    }
    
    public static int input(String message){
        display(message);
        return scan.nextInt();
    }
}
