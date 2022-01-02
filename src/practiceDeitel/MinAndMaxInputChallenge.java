package practiceDeitel;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter Number: ");
        boolean hasNextInt = scan.hasNextInt();


        while (scan.hasNextInt()){
            if (hasNextInt){
                System.out.println("Enter Number: ");
                int userInput = scan.nextInt();
                if (max < userInput){
                    max = userInput;
                }

                if (min > userInput){
                    min = userInput;
                }
            }
        }


        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min) ;
    }
}
