package practiceDeitel;

import java.util.Random;
import java.util.Scanner;

public class AnniversaryCode {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        int number;

            System.out.println("Enter a number between 1 And 10");
            number = userInput.nextInt();
            int randomNumber = new Random().nextInt(10) + 1;
            if (number == randomNumber){
                System.out.println("****************");
                System.out.println("Congratulations");
                System.out.println("*****************");
            }

            else {
                System.out.println("*************");
                System.out.println("You Lost!!!!");
                System.out.println("The random number is " + randomNumber);
                System.out.println("***************");
            }

        System.out.println("Thank you for playing");
        userInput.close();
    }
}
