package kata;

import java.util.Scanner;

public class KataTest {
    public static void main(String[] args) {
        Kata kata = new Kata();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = input.nextInt();
       char grade =  kata.getGrade(score);
        System.out.println(grade);
    }
}
