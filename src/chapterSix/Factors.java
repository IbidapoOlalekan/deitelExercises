package chapterSix;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();


        int count = 0;
        System.out.print("The factors are ");
        for (int root=1; root <= number; root++ ){

          if (number % root == 0){

              System.out.print(root + " ");

              //System.out.printf("The factors are %d%n", root);
              count++;
          }


        }
        System.out.println("");
        System.out.printf("The number of factors are %d",count);
    }
}
