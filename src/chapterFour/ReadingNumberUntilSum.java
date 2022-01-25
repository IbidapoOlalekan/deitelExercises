package chapterFour;

import java.util.Scanner;

public class ReadingNumberUntilSum {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput = 0;
        int sum = 0;

        int number = input("Enter the first number: ");
      for (int count = 0; sum < number ;count++){

          userInput =input("Enter a number: ");
          sum += userInput;
      }

      display("The sum is " + sum);


    }

    public static void display(String message){
        System.out.println(message);
    }
    public static int input(String message){
        System.out.println(message);
        return scanner.nextInt();
    }


}
