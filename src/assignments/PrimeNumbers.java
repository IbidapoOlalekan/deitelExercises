package assignments;

import java.util.Scanner;

public class PrimeNumbers {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num = input("Enter a number to check for :");
        isPrimeNumbers(num);
    }
    public static void isPrimeNumbers(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {

            boolean isNumberPrime = number % i == 0;
            if (isNumberPrime){
                count++;
            }

        }

        boolean isCountTwo = count == 2;
        if (isCountTwo) {
            display(number + " is a prime number");

        } else {
            display(number + " is not a prime number");
        }
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }
}
