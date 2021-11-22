package chapterFour;

import java.util.Scanner;

public class SentinelAssignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int count = 1;
        int minimum ;
        int maximum ;
        int sum = 0;
        double average;
        System.out.println("Please Enter a number: ");
        num = scan.nextInt();
        minimum = num;
        do {

            sum = sum + num;
            count++;
            maximum = num;

            if (maximum < num){
                maximum = num;
            }

            if (minimum > num){
                minimum = num;
            }

        }
       while ((num = scan.nextInt())  != -42);
        average = sum / (count * 1.0);
        System.out.printf("The sum is %d%n",sum);
        System.out.printf("The minimum is %d%n",minimum);
        System.out.printf("The maximum is %d%n", maximum);
        System.out.printf("The average is %.2f%n", average);


    }
}
