package practiceDeitel;

import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int count = 0;
       int sum = 0;
       while (true){
           int order = count+ 1;
           System.out.println("Enter a Number #" + order);

           boolean hasNextInt = scan.hasNextInt();
           if (hasNextInt) {
               int userInput = scan.nextInt();
               count++;
               sum += userInput;
               if (count == 10){
                   break;
               }
           }
           else {
               System.out.println("Invalid Numbers");
           }
            scan.nextLine();
       }
        System.out.println("Sum = " + sum);
    scan.close();

    }
}
