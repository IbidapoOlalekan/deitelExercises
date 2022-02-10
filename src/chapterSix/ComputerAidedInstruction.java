package chapterSix;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAidedInstruction {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new SecureRandom();
    public static void main(String[] args) {
        multiplication();
    }
    public static void multiplication(){
        SecureRandom security = new SecureRandom();
        int firstRandom = getRandomNumber(security, 10);
        int secondRandom = getRandomNumber(security, 10);
        int userInput =0;
  
        int result = firstRandom * secondRandom;
        System.out.printf("How much is  %d times %d\n ",firstRandom,secondRandom);

        while(userInput != result){
            userInput = scanner.nextInt();

            boolean isResultCorrect = userInput == result;
            validateIf(isResultCorrect);


        }

    }

    private static void validateIf(boolean isResultCorrect) {
        if (isResultCorrect) {
            positiveResponse();
            promptUserForMoreQuestion();
        } else {
          negativeResponse();
        }
    }

    public static void promptUserForMoreQuestion(){
        display("Press 1 to Continue And Press 2 To End Game");
        int response  = scanner.nextInt();
        boolean moreQuestion = response == 1;
        requestFor(moreQuestion);
    }

    private static void requestFor(boolean wantsMoreQuestion) {
        if (wantsMoreQuestion){
            multiplication();
        }
        else {
            System.exit(0);
        }
    }

    public static void display(String message){
        System.out.println(message);
    }

    public static void positiveResponse(){
        int randomGenerator = getRandomNumber(random, 4);
        check(randomGenerator, "Very Good", "Excellent", "Nice Work", "Keep Up the Good Work");

    }

    private static void check(int randomGenerator, String message, String secondMessage, String thirdMessage, String fourthMessage) {
        switch (randomGenerator) {
            case 1:
                display(message);
                break;
            case 2:
                display(secondMessage);
                break;
            case 3:
                display(thirdMessage);
                break;
            case 4:
                display(fourthMessage);
                break;

        }
    }

    public static void negativeResponse() {
        int randomGenerator = getRandomNumber(random, 4);
        check(randomGenerator, "No Please try again", "Wrong. Try once more", "Don't give up", "No Keep Trying");

    }

    private static int getRandomNumber(Random random, int range) {
        return 1 + random.nextInt(range);
    }
}
