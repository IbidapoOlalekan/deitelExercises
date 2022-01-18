package chapterTwo;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
    private static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ;
        double milesDriven= input("Enter total miles driven per day: ");

        double costOfGasoline= input("Enter cost per gallon of gasoline: ");

        double averageMilesPerGallon= input("Enter average miles per gallon: ");

        double parkingFeePerDay= input("Enter parking fee per Day: ");

        double tollsPerDay= input("Enter tolls per day: ");

        double dailyDrivingCost = ((milesDriven / averageMilesPerGallon) * costOfGasoline) + parkingFeePerDay + tollsPerDay;

        System.out.printf("Daily driving cost is %.2f%n", dailyDrivingCost);
    }

    public static double input(String message){
        System.out.println(message);
        return scan.nextDouble();
    }

    public static String display(String message){
        return String.format(message);
    }
}
