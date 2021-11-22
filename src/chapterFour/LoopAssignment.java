package chapterFour;

import java.util.Scanner;
// Get ten numbers from a user
// Compare the numbers
// Display the minimum,maximum and the average number
public class LoopAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int minimum ;
        int maximum ;
        int sum = 0;
        int count = 1;
        double average;

        System.out.println("Enter a number:  ");
        num = input.nextInt();
        maximum = num;
        minimum = num;
        while (count < 10){
            num = input.nextInt();

            sum = sum + num;
            count++;
            if ( maximum < num){
                maximum = num;

            }
            if (minimum > num){
                minimum = num;
            }





        }

        System.out.println("The count is" +  count);
        average = sum / (count*1.0);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The largest number is %d%n", maximum);
        System.out.printf("The smallest number is %d ",minimum);


    }
}
