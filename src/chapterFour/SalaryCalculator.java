package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Get the employee details
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String name = scan.nextLine();
        System.out.println("Enter the hours : ");
        int hours = scan.nextInt();
        System.out.println("Enter the hourly rate: ");
        double hourlyRate = scan.nextDouble();

            double grossPay = hours * hourlyRate;
            System.out.printf("%s gross pay is : %.2f%n",name,grossPay);

            if (hours > 40){
                hours =  hours - 40;
                double newGross = hours * hourlyRate * 1.5;

                grossPay = grossPay + newGross;

                System.out.printf("%s gross pay is : %.2f",name,grossPay);
            }

    }
}
