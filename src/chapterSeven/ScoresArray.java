package chapterSeven;

import java.util.Scanner;

public class ScoresArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count= 0;
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] scores= new int[10];

        for ( int i = 0; i < scores.length; i++){
            System.out.println("Enter a scores: ");
                scores[i] = scanner.nextInt();

                total += scores[i];

                if (max < scores[i]){
                    max = scores[i];
                }

                if (min > scores[i]){
                    min = scores[i];
                    count++;
                }

        }
        for (int score : scores){
            System.out.print(score + " ");
            System.out.println();

        }

        double average = (double) total / count;
        System.out.printf("The total scores is %d%n", total);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The maximum value is %d%n ",max);
        System.out.printf("The minimum value is %d%n", min);
    }
}
