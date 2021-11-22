package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallest {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number= scan.nextInt();
         System.out.println("Enter a number: ");
         int numbertwo = scan.nextInt();
         System.out.println("Enter a number: ");
         int numberthree = scan.nextInt();

         if (number > numbertwo & number > numberthree){
         System.out.printf("%d is the largest%n",number);
         }
         else {

         if (numbertwo > number & numbertwo > numberthree) {
         System.out.printf("%d is the largest%n", numbertwo);
         }

         else {
         if (numberthree > number & numberthree > numbertwo){
         System.out.printf("%d is the largest%n", numberthree);
         }

         }
         }

         if (number < numbertwo & number < numberthree) {
         System.out.printf("%d is the smallest%n",number);
         }
         else {
         if (numbertwo < number & numbertwo < numberthree){
         System.out.printf("%d is the smallest%n", numbertwo);
         }
         else {
         System.out.printf("%d is the smallest%n",numberthree);
         }
         }
    }
}
