package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    private static final  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int i;

        int count  = 3;
        for (i=1; i <= count; i ++){

            String name = input();

            double earning = input("Enter the earning of the citizen: ");
            calculateEarning(name, earning);

             name = scan.nextLine();

        }

    }

    private static void calculateEarning(String name, double earning) {
        boolean isEarningLessThan30K = earning <= 30000;
        if (isEarningLessThan30K){
            double tax = (0.15 * earning);
            System.out.printf("The tax for %s is %.2f%n", name, tax);
        }
        else {
            boolean isEarningGreaterThan30K = earning > 30000;
            if (isEarningGreaterThan30K){
                double tax = (0.20 * earning);
                System.out.printf("The tax for %s is %.2f%n", name,tax);
            }
        }
    }

    private static void display(String message){
        System.out.println(message);
    }

    private static double input(String message){
        display(message);
        return scan.nextDouble();
    }

    private static String input(){
        display("Enter the name of the citizen: ");
        return scan.nextLine();
    }
}
