package chapterFour;

import java.util.Scanner;

public class SquareOfAsterisks {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int size = input();

        drawSquareOf(size);
    }

    private static void drawSquareOf(int size) {
        for (int i = 1; i <= size; i++){
            for (int j = 1; j < i; j++ ){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }

    private static int input(){
        System.out.println("Enter the size of the square: ");
        return scan.nextInt();
    }
}
