package practiceDeitel;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        double interestRate = 0.00417;
        System.out.println("Enter the monthly savings amount: ");
        double savings = scan.nextDouble();
        double answer = savings * (1 + interestRate);
        double secondMonthSavings = (answer + savings) * (1 + interestRate);
        double thirdMonthSavings = (answer + secondMonthSavings) * (1 + interestRate);
        double fourthMonthSavings = (answer + thirdMonthSavings) * (1 + interestRate);
        double fifthMonthSavings = (answer + fourthMonthSavings) * (1 + interestRate);
        double sixthMonthSavings = (answer + fifthMonthSavings) * (1 + interestRate);

        System.out.println("The first month savings is : " + answer);
        System.out.printf("The second month savings is %.2f\n", secondMonthSavings);
        System.out.printf("The third month savings is %.2f\n",thirdMonthSavings);
        System.out.printf("The fourth month savings is %.2f\n",fourthMonthSavings);
        System.out.printf("The fifth month savings is %.2f\n",fifthMonthSavings);
        System.out.printf("The sixth month savings is %.2f\n",sixthMonthSavings);

    }

}
