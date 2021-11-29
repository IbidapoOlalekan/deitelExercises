package assignments;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;

        SecureRandom numbers = new SecureRandom();

        int guess = numbers.nextInt(1000);
        int numberOfGuess = 0;
        int num;
        do {
            System.out.println("Guess a number between 1 and 1000");
             num = scan.nextInt();
            numberOfGuess++;

            if (num < guess) {
                System.out.println("Too Low.. Try Again!!!!!!");
            } else {
                if (num == guess) {
                    System.out.println("Congratulations, You guessed the number!!!");
                } else {
                    System.out.println("Too High... Try Again!!!!!");
                }
            }
        }
        while (num != guess);

        System.out.printf("The number of trial is %d%n", numberOfGuess);
        if (numberOfGuess < 10){
            System.out.println("Either you know the secret or You got lucky");
        }
        else {
            if (numberOfGuess == 10){
                System.out.println("Aha. You know the secret");
            }
            else {
                System.out.println("You should be able to do better!!!!!");
            }

        }

    }
}
