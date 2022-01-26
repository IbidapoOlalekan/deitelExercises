package chapterFour;

import java.util.Scanner;

public class DecimalEquivalentOfBinaryNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        display("Enter A Number in 0's and 1's");
        int userInput = scanner.nextInt();
        int binary = binaryToDecimalOf(userInput);
        System.out.printf("The decimal equivalent of %d is %d",userInput,binary);

    }
    public static int binaryToDecimalOf(int number){
        int decimalValue = 0;

        int base = 1;

        int temp = number;

        while (temp > 0  ){
            int last_digit = temp % 10;
            temp = temp / 10;
            decimalValue += last_digit * base;
            base = base * 2;
        }
        return decimalValue;
    }

    public static void display(String message){
        System.out.println(message);
    }

}
