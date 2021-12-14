package practiceDeitel;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       SpeedConverter.display("Enter a number in km/hr : ");
        double userInput =scan.nextDouble();
       SpeedConverter.toMilesPerHour(userInput);
       SpeedConverter.printConversion(userInput);

       MegaBytesConverter.printMegaBytesAndKiloBytes(1924);

      boolean bark =  BarkingDog.shouldWakeUp(false,6);
        System.out.println(bark);

        boolean leapYear = LeapYearCalculator.isLeapYear(1924);
        System.out.println(leapYear);

    }
}
