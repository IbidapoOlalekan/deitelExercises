package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int maximum;
        int minimum;
        int count = 1;
        askForANumber();
        num = scan.nextInt();
        maximum = num;
        minimum = num;
        while (count < 3) {
            askForANumber();
            num = scan.nextInt();
            count++;
            boolean isMaximum = maximum < num;
            if (isMaximum) {
                maximum = num;

            }
            boolean isMinimum = minimum > num;
           if (isMinimum){
               minimum = num;
           }


        }
        System.out.printf("The largest number is %d%n",maximum);
        System.out.printf("The smallest number is %d%n",minimum);
         }

    public static  void askForANumber(){
         System.out.println("Enter A Number: ");
    }
    public static String display(String message){
        return message;
    }
}
