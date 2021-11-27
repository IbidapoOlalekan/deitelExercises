package chapterFour;

import java.util.Scanner;

public class SalesComissionCalculator {
    public static void main(String[] args) {

        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input count of the sales person: ");
        int count = scan.nextInt();

        for (i = 0; i < count; i++){
            System.out.printf("SalesPerson %d sales:%n ",i +1 );
            double sales = scan.nextDouble();
            System.out.printf("Earnings: %.2f%n", 200 + (sales*0.09));
        }
    }
}
