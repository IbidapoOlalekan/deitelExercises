package chapterSix;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Character: ");
        char fill = scan.next().charAt(0);
        System.out.println("Enter the number of SIdes:");
        int sides = scan.nextInt();

        squareOfAnyCharacter(sides,fill);

    }

    public static void squareOfAnyCharacter(int sides, char fillCharacter){
        for (int i = 0; i < sides; i++){
            for (int j = 0; j < sides; j ++){
                System.out.print(fillCharacter);
            }
            System.out.println(" ");
        }
    }
}
