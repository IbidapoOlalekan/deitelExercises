package assignments;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    guess();


    }

    public static void guess(){
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
                    display("Congratulations, You guessed the number!!!");
                    promptUserForMoreQuestion();
                } else {
                   display("Too High... Try Again!!!!!");
                }
            }
        }
        while (num != guess);

        System.out.printf("The number of trial is %d%n", numberOfGuess);
        if (numberOfGuess < 10){
            display("Either you know the secret or You got lucky");
        }
        else {
            if (numberOfGuess == 10){
                display("Aha. You know the secret");
            }
            else {
                display("You should be able to do better!!!!!");
            }

        }
    }
    public static void promptUserForMoreQuestion(){
        display("Press 1 to Continue And Press 2 To End Game");
        int response  = scan.nextInt();
        if (response == 1){
            guess();
        }
        else {
            System.exit(0);
        }
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
