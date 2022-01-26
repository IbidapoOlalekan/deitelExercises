package chapterFour;

import java.util.Scanner;

public class EstimateValue   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display("Enter the number of terms : ");
        int userInput = scanner.nextInt();
        double e = 1;
        for (double i = 0; i <= userInput;i++){
            e = e + (1/factorial(i));

        }
        display("E: " + e);
    }
    public static void display(String message){
        System.out.println(message);
    }

    public static int factorial(int number){
        int product = 1;
        for (int i = 0 ; i < number ; number--){
            product *= number;
        }
        return product;
    }
    public static double factorial(double number){
        double product = 1.0;
        for (int i = 0 ; i < number ; number--){
            product *= number;
        }
        return product;
    }
}
