package kata;

import chapterSeven.Array;

public class Kata {

    public static int calculateTotalOf(int[] numbers) {
        int total = 0;
        for (int i = 0 ; i  < numbers.length; i++ ){
            total += numbers[i];
        }
        return total;
    }

    public static int determineMinimumOf(int[] numbers) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (minimum > numbers[i]){
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static int determineMaximumOf(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }

        }
        return max;
    }

    public static double calculateAverageOf(int[] numbers) {
       int total =  calculateTotalOf(numbers);
       double average = 0 ;
        for (int i = 0; i < numbers.length; i++){
            average = (double) total / numbers.length;
        }
        return average;
    }

    public char getGrade(int score){
        char grade = ' ';
        if (score >= 90)  return 'A';
        else if (score >= 80 ) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else if (score >= 50) return 'E';
        else return 'F';
    }
    public static void displayArray(int[][] array){
        for (int counter = 0; counter < array.length; counter++){
            for (int j = 0; j < array[counter].length; j++){
                System.out.print(array[counter][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    public static void displayArray(String[][] array){
        for (int counter = 0; counter < array.length; counter++){
            for (int j = 0; j < array[counter].length; j++){
                System.out.print(array[counter][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
