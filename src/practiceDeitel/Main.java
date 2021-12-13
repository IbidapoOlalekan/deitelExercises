package practiceDeitel;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       SpeedConverter.display("Enter a number in km/hr : ");
        double userInput =scan.nextDouble();
       SpeedConverter.toMilesPerHour(userInput);
       SpeedConverter.printConversion(userInput);

    }
}
