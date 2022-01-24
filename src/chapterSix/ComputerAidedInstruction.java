package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAidedInstruction {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        multiplication();
    }
    public static void multiplication(){
        SecureRandom security = new SecureRandom();
        int  firstRandom = 1 + security.nextInt(10);
        int secondRandom = 1 + security.nextInt(10);
        int userInput =0;

        int result = firstRandom * secondRandom;
        System.out.printf("How much is  %d times %d\n ",firstRandom,secondRandom);

        while(userInput != result){
            userInput = scanner.nextInt();

            if (userInput == result) {
                System.out.println("Very Good");
                promptUserForMoreQuestion();
            } else {
                System.out.println("No Please Try Again");
            }


        }

    }

    public static void promptUserForMoreQuestion(){
        System.out.println("Press 1 to Continue And Press 2 To End Game");
        int response  = scanner.nextInt();
        if (response == 1){
            multiplication();
        }
        else {
            System.exit(0);
        }
    }


}
