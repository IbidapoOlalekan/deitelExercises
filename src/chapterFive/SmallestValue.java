package chapterFive;

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {
        int minimum  = 0 ;
        Scanner scanner = new Scanner(System.in);
        display("Number Of Values: ");
        int values = scanner.nextInt();
        for (int i = 1; i <= values; i++){
            display("Enter a number: ");
            int number = scanner.nextInt();
            minimum = minimumValueOf(number);
        }
        System.out.printf("The minimum value is %d",minimum);

    }

    public static void display(String message){
        System.out.println(message);
    }
   public static int minimumValueOf(int numbers){
        int minimum = Integer.MAX_VALUE;
       if (minimum > numbers){
           minimum = numbers;
       }
           return minimum ;
   }

}
