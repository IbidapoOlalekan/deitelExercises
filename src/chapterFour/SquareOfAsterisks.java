package chapterFour;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the square: ");
        int size = scan.nextInt();

        for (int i = 1; i <= size; i++){
            for (int j = 1; j < i; j++ ){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
