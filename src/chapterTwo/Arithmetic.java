package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        //2.15
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int numberone = scan.nextInt();
         System.out.println("Enter a number : ");
         int numbertwo = scan.nextInt();

         System.out.printf("The sum is %d%n ",numberone + numbertwo);
         System.out.printf("The diffrence is %d%n", numberone - numbertwo);
         System.out.printf("The product is %d%n", numberone * numbertwo);
         System.out.printf("The quotient is %d", numberone / numbertwo);
    }
}
