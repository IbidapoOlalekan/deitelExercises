package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num;

        int maximum;
        int minimum;


        int count = 1;


        askForNumber();
        num = scan.nextInt();
        maximum = num;
        minimum = num;
        while (count < 3) {
            askForNumber();
            num = scan.nextInt();
            count++;
            if (maximum < num) {
                maximum = num;

            }
           if (minimum > num){
               minimum = num;
           }


        }
        System.out.printf("The largest number is %d%n",maximum);
        System.out.printf("The smallest number is %d%n",minimum);
         }

    public static  void askForNumber(){
         System.out.println("Enter A Number: ");
    }
}
