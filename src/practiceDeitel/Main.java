package practiceDeitel;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       SpeedConverter.display("Enter a number in km/hr : ");
        double userInput =scan.nextDouble();
       SpeedConverter.toMilesPerHour(userInput);

       MegaBytesConverter.printMegaBytesAndKiloBytes(1924);

      boolean bark =  BarkingDog.shouldWakeUp(false,6);
        System.out.println(bark);

        boolean leapYear = LeapYearCalculator.isLeapYear(1924);
        System.out.println(leapYear);

        boolean equal = DecimalComparator.areEqualByThreeDecimalPlaces(3.176,3.175);
        System.out.println(equal);

        DecimalComparator.calcFeetAndInchesToCentimeters(10,1);

       String time =  SecondsAndMinutes.getDurationString(61,00);
        System.out.println(time);
        String newTime = SecondsAndMinutes.getDurationString(3945L);
        System.out.println(newTime);
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        IntEqualityPrinter.printEqual(1,1,3);
       boolean go =  PlayingCat.isCatPlaying(false,35);
        System.out.println(go);
        int count = 0;
        for (int i = 10; i <= 50; i++){
            if (LoopPractice.isPrime(i)){
                count++;
                System.out.println("Number "+ i + " is a prime number");
                if (count == 3){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        int total = SumOddRange.sumOdd(1,100);
        System.out.println(total);

    }
}
