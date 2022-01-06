package chapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        int largest;

        int secondLargest;

        int count = 1;


        System.out.println("Enter a number:  ");
        num = scan.nextInt();
        largest = num;
        secondLargest = num;
        while (count < 10) {
            System.out.println("Enter a number:  ");
            num = scan.nextInt();
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
}
