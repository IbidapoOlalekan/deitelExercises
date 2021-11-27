package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Get Ten scores from the user
        //Get and Display the largest number inputted

        Scanner scan = new Scanner(System.in);
        int num;

        int largest;

        int count = 1;


        System.out.println("Enter a number:  ");
        num = scan.nextInt();
        largest = num;
        while (count < 10) {
            num = scan.nextInt();
            count++;
            if (largest < num) {
                largest = num;

            }


        }
        System.out.printf("The largest number is %d%n",largest);
    }
}

