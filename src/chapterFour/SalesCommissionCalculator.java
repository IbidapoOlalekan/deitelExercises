package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int i;

        int salesOfUser = input("Enter the input count of the sales person: ");

        calculateEarnings(salesOfUser);
    }

    private static void calculateEarnings(int count) {
        int i;
        for (i = 0; i < count; i++){
            System.out.printf("SalesPerson %d sales:%n ",i +1 );
            double sales = scan.nextDouble();
            System.out.printf("Earnings: %.2f%n", 200 + (sales*0.09));
        }
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }
}
