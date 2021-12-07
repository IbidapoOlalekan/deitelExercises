package chapterSeven;

import java.util.Scanner;

public class ScoresArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count= 0;
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] score= new int[10];

        for ( int i = 0; i < score.length; i++){
            System.out.println("Enter a score: ");
                score[i] = scanner.nextInt();

                total += score[i];

                if (max < score[i]){
                    max = score[i];
                }

                if (min > score[i]){
                    min = score[i];
                    count++;
                }

        }
        for (int i : score){
            System.out.print(i + " ");

        }

        double average = (double) total / count;
        System.out.printf("The total score is %d%n", total);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The maximum value is %d%n ",max);
        System.out.printf("The minimum value is %d%n", min);
    }
}
