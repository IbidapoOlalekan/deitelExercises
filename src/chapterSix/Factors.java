package chapterSix;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Factors {
    public static int calculateFactorsOf(int userInput){
        int factors = 0;
        for (int number = 1; number <= userInput; number++){
            if (userInput % number == 0){
                factors++;
            }
        }
        return factors;
    }
    public static void main(String[] args) {
        calculatePrimeNumbers();

    }
    public static void calculatePrimeNumbers(){
        System.out.println("Enter a number to check for: ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        int result  = calculateFactorsOf(userInput);

        if (result == 2){
            System.out.printf("%d is a Prime number%n",userInput);
        }
        else {
            System.out.printf("%d is not a prime number%n",userInput);
        }
    }

}
