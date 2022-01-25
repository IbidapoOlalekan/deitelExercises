package chapterFour;

import java.util.Scanner;
// Get ten numbers from a user
// Compare the numbers
// Display the minimum,maximum and the average number
public class LoopAssignment {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        int minimum ;
        int maximum ;
        int sum = 0;
        int count = 1;
        double average;

        num = input("Enter A Number: ");
        maximum = num;
        minimum = num;
        while (count < 10){
            num = input.nextInt();

            sum = getSum(num, sum);
            count++;
            maximum = getMaximum(num, maximum);
            minimum = getMinimum(num, minimum);


        }

        display("The count is " +  count);
        average = getAverage(sum, count);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The largest number is %d%n", maximum);
        System.out.printf("The smallest number is %d ",minimum);


    }

    private static double getAverage(int sum, int count) {
        double average;
        average = sum / (count*1.0);
        return average;
    }

    private static int getSum(int num, int sum) {
        sum = sum + num;
        return sum;
    }

    private static int getMinimum(int num, int minimum) {
        if (minimum > num){
            minimum = num;
        }
        return minimum;
    }

    private static int getMaximum(int num, int maximum) {
        if ( maximum < num){
            maximum = num;
        }
        return maximum;
    }

    public static void display(String message){
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return input.nextInt();
    }
}
