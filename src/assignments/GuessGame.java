package assignments;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;

        SecureRandom numbers = new SecureRandom();

        int guess = numbers.nextInt(1000);
        int numberOfTries = 0;
        int num;
        do {
            System.out.println("Guess a number between 1 and 1000");
             num = scan.nextInt();
            numberOfTries++;

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

    }
}
