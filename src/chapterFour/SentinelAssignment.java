package chapterFour;

import java.util.Scanner;

public class SentinelAssignment {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        calculate();



    }

    private static void calculate() {
        int num;
        int count = 1;
        int minimum ;
        int maximum ;
        int sum = 0;
        double average;

        num = input("Please Enter A Number: ");
        minimum = num;
        do {

            sum = sum + num;
            count++;
            maximum = num;
            maximum = getMaximum(num, maximum);
            minimum = getMinimum(num, minimum);

        }
       while ((num = scan.nextInt())  != -42);

        average = sum / (count * 1.0);
        System.out.printf("The sum is %d%n",sum);
        System.out.printf("The minimum is %d%n",minimum);
        System.out.printf("The maximum is %d%n", maximum);
        System.out.printf("The average is %.2f%n", average);
    }

    private static int getMinimum(int num, int minimum) {
        if (minimum > num){
            minimum = num;
        }
        return minimum;
    }

    private static int getMaximum(int num, int maximum) {
        if (maximum < num){
            maximum = num;
        }
        return maximum;
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }
}
