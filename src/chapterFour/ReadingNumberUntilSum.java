package chapterFour;

import java.util.Scanner;

public class ReadingNumberUntilSum {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput = 0;
        int sum = 0;
        display("Enter the first number: ");
        int number = scanner.nextInt();
      for (int count = 0; sum < number ;count++){
          display("Enter a number: ");
          userInput = scanner.nextInt();
          sum += userInput;
      }

      display("The sum is " + sum);


    }

    public static void display(String message){
        System.out.println(message);
    }

}
