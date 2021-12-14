package practiceDeitel;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
         int finalScore =    finalScore(true,score ,levelCompleted,bonus);
            display("The final score was " + finalScore);
            int position =  calculateHighScorePosition(score);
            displayHighScorePosition("Latifat",position);
        }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver){
           int finalScore =  finalScore(true,score,levelCompleted,bonus);
            display("The final score is " + finalScore);
            int position =  calculateHighScorePosition(score);
          displayHighScorePosition("Ibidapo",position);

        }

        int position =  calculateHighScorePosition(1500);
        displayHighScorePosition("James",position);


        position =  calculateHighScorePosition(1000);
        displayHighScorePosition("Cole",position);
            display("******************************");
        Scanner scanner = new Scanner(System.in);
        display("Enter a number: ");
        int userInput = scanner.nextInt();

        reverse(userInput);



    }



    public static void display(String message){
        System.out.println(message);
    }
    public static int finalScore(boolean gameOver, int score, int levelCompleted, int bonus){
       if (gameOver) {
           int finalScore = score + (levelCompleted * bonus);
           finalScore += 1000;
           return finalScore;
       }
       return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        display(name + " managed to get into position "  + position + "on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >= 100){
            return 3;
        }
        return 4;

    }

    public static void reverse(int number){
        int reverse = 0;

        int temp = number;
        int remainder = 0;

        while (temp > 0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        display("Reverse of" + number + " is " + reverse);
    }


}
