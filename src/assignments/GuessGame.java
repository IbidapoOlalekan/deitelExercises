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
            num = input("Guess a number between 1 and 1000");
            numberOfGuess++;

            boolean isLessThanAnswer = num < guess;
            if (isLessThanAnswer) {
                display("Too Low.. Try Again!!!!!!");
            } else {
                boolean isCorrect = num == guess;
                if (isCorrect) {
                    display("Congratulations, You guessed the number!!!");
                    promptUserForMoreQuestion();
                } else {
                   display("Too High... Try Again!!!!!");
                }
            }
        }
        while (num != guess);

        System.out.printf("The number of trial is %d%n", numberOfGuess);
        boolean isNumberOfGuessLessThanTen = numberOfGuess < 10;
        if (isNumberOfGuessLessThanTen){
            display("Either you know the secret or You got lucky");
        }
        else {
            boolean numberOfGuessIsTen = numberOfGuess == 10;
            if (numberOfGuessIsTen){
                display("Aha. You know the secret");
            }
            else {
                display("You should be able to do better!!!!!");
            }

        }
    }
    public static void promptUserForMoreQuestion(){
        int response  = input("Press 1 to continue And Press 2 To End Game");
        boolean responseIsOne = response == 1;
        if (responseIsOne){
            guess();
        }
        else {
            System.exit(0);
        }
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scan.nextInt();
    }
}
