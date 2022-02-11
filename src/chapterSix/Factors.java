package chapterSix;

import  java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Factors {
    private static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        calculatePrimeNumbers();
    }

    public static int calculateFactorsOf(int userInput){
        int factors = 0;
        for (int number = 1; number <= userInput; number++){
            factors = getFactors(userInput, factors, number);
        }
        return factors;
    }

    private static int getFactors(int userInput, int factors, int number) {
       boolean isUserInputAFactorOfNumber = userInput % number == 0;
        if (isUserInputAFactorOfNumber){
            factors++;
        }
        return factors;
    }

    public static void calculatePrimeNumbers(){
        int userInput = input("Enter a number to check for: ");

        int result  = calculateFactorsOf(userInput);

        boolean isResultTwo = result == 2;
        if (isResultTwo){
            System.out.printf("%d is a Prime number%n",userInput);
        }
        else {
            System.out.printf("%d is not a prime number%n",userInput);
        }
    }

    public static void display(String message){
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scan.nextInt();

    }

}
