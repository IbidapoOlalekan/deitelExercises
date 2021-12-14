package practiceDeitel;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evenSum = 0;
        int oddSum  = 0 ;
        char choice;

        do {
            display("Enter A Number : ");
            int userInput = scan.nextInt();
            if (userInput % 2 == 0){
                evenSum += userInput;
            }
            else {
                oddSum += userInput;
            }
            display("Do you want to continue y/n? ");
            choice = scan.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');

        display("The sum of Even Numbers is " + evenSum);
        display("The sum of Odd Numbers is " + oddSum);


    }

    public static void display(String message){
        System.out.println(message);
    }

}
