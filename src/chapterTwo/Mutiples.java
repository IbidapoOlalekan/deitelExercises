package chapterTwo;

import java.util.Scanner;

public class Mutiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        System.out.println("Enter a number: ");
        int num2 = input.nextInt();

        if(num %  num2 == 0){
            System.out.printf("%d is a mutiple of %d",num,num2);
        }
        else
            System.out.println("It is not a mutiple!!!!");

    }

}