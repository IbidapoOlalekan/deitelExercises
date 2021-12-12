package practiceDeitel;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100) + 1;
        int numOfGuesses =0;

        System.out.println("**********");
        System.out.println("Welcome To Guessing Game");
        System.out.println("***********");

        System.out.println("Enter a number between 1 and 100:");
        int userInput = keyboard.nextInt();
        numOfGuesses++;
        while (randomNumber != userInput){
            System.out.println("Try Again");
            System.out.println("Enter a number between 1 and 100: ");
            userInput = keyboard.nextInt();
            numOfGuesses++;
            if (userInput > randomNumber){
                System.out.println("Guess is too high!!!!");
            }
            else {if (userInput < randomNumber) System.out.println("Guess is too low");
                else {
                System.out.println("Congratulations");
            }
            }
        }
        System.out.printf("You win after %d trial",numOfGuesses);
    }
}
