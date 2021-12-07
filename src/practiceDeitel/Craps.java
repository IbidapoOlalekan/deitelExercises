package practiceDeitel;

import jdk.swing.interop.SwingInterOpUtils;

import java.security.SecureRandom;

public class Craps {
    private  static final SecureRandom randomNumbers = new SecureRandom();
    private Status status;

    private static final int SNAKE_EYES = 2;
    private static final int THREE = 3;
    private static final int SEVEN = 7;
    private static final int ELEVENS = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN :
            case ELEVENS :
                    gameStatus = Status.WON;
                    break;
            case SNAKE_EYES:
            case THREE :
            case BOX_CARS :
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus =Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE)
        {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) gameStatus = Status.LOST;
        }
        if (gameStatus == Status.WON)
            System.out.println("Player won!!!!");
        else
            System.out.println("Player Loses!!!!!!");
    }

    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

       int  sum =  die2 + die1;

        System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);
        return sum;
    }

}
