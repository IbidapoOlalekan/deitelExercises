package chapterFour;

import java.util.Scanner;

public class GasMileage {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int miles = 0 ;
        int count = 0;

        do {
             calculateMilesPerGallon();
        }

        while ((miles=input.nextInt()) != -1);
    }

    private static void calculateMilesPerGallon() {
        int miles;
        int gallons;
        int count = 0;
        miles = input("Enter the miles: ");

        gallons = input("Enter the gallons: ");
        double milesPerGallons = (miles * 1.0) / (gallons * 1.0);

        count++;

        System.out.printf("The miles per gallon for %d trip is %.2f%n%n", count,milesPerGallons);
        display("Press Any Number to Continue And -1 to quit");
       // return count;
    }

    public static int input(String message){
        System.out.println(message);
        return input.nextInt();
    }

    public static String display(String message){
        System.out.println(message);
        return message;
    }
}
