package chapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int num;

        int largest;

        int secondLargest;

        int count = 1;


        num = input("Enter a number: ");
        largest = num;
        secondLargest = num;
        while (count < 10) {

            num = input("Enter a number: ");
            count++;
            if (num >= largest) {
                secondLargest = largest;
                largest = num;

            }
            else if (num > secondLargest){
                secondLargest = num;
            }
        }
        System.out.printf("The largest number is %d%n",largest);
        System.out.printf("The second largest number is %d%n",secondLargest);
    }

    private static void display(String message){
        System.out.println(message);
    }

    private static int input(String message){
        display(message);
        return scan.nextInt();
    }
}
