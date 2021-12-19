package practiceDeitel;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evenSum = 0;
        int oddSum  = 0 ;
        char choice;

        do {
            print("Enter A Number : ");
            int userInput = scan.nextInt();
            if (userInput % 2 == 0){
                evenSum += userInput;
            }
            else {
                oddSum += userInput;
            }
            print("Do you want to continue y/n? ");
            choice = scan.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println();
        print("The sum of Even Numbers is " + evenSum);
        print("The sum of Odd Numbers is " + oddSum);


    }

    public static void print(String message){
        System.out.println(message);
    }

}
