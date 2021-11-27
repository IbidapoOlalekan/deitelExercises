package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        int i;
        Scanner scan = new Scanner(System.in);
        int count  = 3;
        for (i=1; i <= count; i ++){
            System.out.printf("Enter the name of the citizen: ");
            String name = scan.nextLine();
            System.out.println("Enter the earning of the citizen: ");
            double earning = scan.nextDouble();
            if (earning <= 30000){
                double tax = (0.15 * earning);
                System.out.printf("The tax for %s is %.2f%n",name, tax);
            }
            else {
                if (earning >= 30000){
                    double tax = (0.20 * earning);
                    System.out.printf("The tax for %s is %.2f%n",name,tax);
                }
            }
            System.out.printf("Enter the name of the citizen: ");
             name = scan.nextLine();

        }

    }
}
