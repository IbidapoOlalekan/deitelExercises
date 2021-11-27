package chapterFour;

import java.util.Scanner;

public class GasMilleage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles ;
        int gallons;
        int count = 0;

        do {

            System.out.println("Enter the miles: ");
            miles = input.nextInt();
            System.out.println("Enter the gallons: ");
            gallons = input.nextInt();
            double milesPerGallons = (miles * 1.0) / (gallons * 1.0);
            count++;

            System.out.printf("The miles per gallon for %d trip is %.2f%n%n",count,milesPerGallons);
            System.out.println("Press Any Number to Continue And -1 to quit");
        }

        while ((miles=input.nextInt()) != -1);


    }
}
