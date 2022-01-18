package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    private static Scanner scan = new Scanner(System.in);;
    public static void main(String[] args) {

        int numberOne = input("Enter A Number: ");

        int numberTwo = input("Enter A Number: ");

        boolean numberOneIsLarger = numberOne > numberTwo;
        boolean bothNumbersAreEqual = numberOne == numberTwo;

        if (numberOneIsLarger) {
            System.out.printf("%d is larger", numberOne);
        } else {
            if (bothNumbersAreEqual) {
                System.out.printf("These numbers are equal");
            } else {
                System.out.printf("%d is larger", numberTwo);
            }
        }
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }

}

