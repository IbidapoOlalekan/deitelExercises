package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String name = input("Enter the employee name: ");
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

    public static void display(String message){
        System.out.println(message);
    }
    public static String input(String message){
        System.out.println(message);
        return scan.nextLine();
    }


}
