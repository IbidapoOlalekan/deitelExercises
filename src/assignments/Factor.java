package assignments;

import java.util.Scanner;

public class Factor {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       int userInput =  input("Enter a Number: ");
       int factor = factorOf(userInput);
        System.out.println("The number of factors of " + userInput + " is " + factor);
    }

    private static int factorOf(int userInput){
        int count = 0;
        for (int i = 1; i <= userInput; i++){
            if (userInput % i == 0)count++;
        }
        return count;
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }
}
