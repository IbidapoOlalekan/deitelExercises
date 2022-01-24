package practiceDeitel;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGames {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        guessGame();


    }

    public static void guessGame(){
        int count;

        SecureRandom numbers = new SecureRandom();

        int guess = numbers.nextInt(1000);
        int numberOfGuess = 0;
        keepGuessing(guess, numberOfGuess);

        printThe(numberOfGuess);
    }

    private static void printThe(int numberOfGuess) {
        System.out.printf("The number of trial is %d%n", numberOfGuess);
        scoreThe(numberOfGuess);
    }

    private static void scoreThe(int numberOfGuess) {
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

    private static void keepGuessing(int guess, int numberOfGuess) {
        int num;
        do {
            display("Guess a number between 1 and 1000");
            num = scan.nextInt();
            numberOfGuess++;

            validateGuess(guess, num);
        }
        while (num != guess);
    }

    private static void validateGuess(int guess, int num) {
        boolean guessIsLow = num < guess;
        boolean correctGuess = num == guess;
        if (guessIsLow) {
            display("Too Low.. Try Again!!!!!!");
        } else {
            if (correctGuess) {
                display("Congratulations, You guessed the number!!!");
                promptUserForMoreQuestion();
            } else {
                display("Too High... Try Again!!!!!");
            }
        }
    }

    public static void promptUserForMoreQuestion(){
        display("Press 1 to Continue And Press 2 To End Game");
        int response  = scan.nextInt();
        validate(response);
    }

    private static void validate(int response) {
        boolean isContinueGame = response == 1;
        if (isContinueGame){
            guessGame();
        }
        else {
            System.exit(0);
        }
    }

    public static void display(String message) {
        System.out.println(message);

    }
}
