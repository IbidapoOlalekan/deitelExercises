package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

         int numberOne = input("Enter A Number: ");

         int numberTwo = input("Enter A NUmber: ");

        System.out.print("hello");
        System.out.println("thwe");
         System.out.printf("The sum is %d%n ",numberOne + numberTwo);
         System.out.printf("The difference is %d%n", numberOne - numberTwo);
         System.out.printf("The product is %d%n", numberOne * numberTwo);
         System.out.printf("The quotient is %d", numberOne / numberTwo);
    }

    public static int input(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextInt();
    }
}
