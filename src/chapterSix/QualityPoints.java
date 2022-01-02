package chapterSix;

import java.util.Scanner;

public class QualityPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Average : ");
        int userInput = scanner.nextInt();
        int result=  qualityPoint(userInput);
        System.out.println(result);

    }

    public static int qualityPoint(int average){
        if (average >= 90 && average <= 100){
            return 4;
        }
        else if (average >= 80 && average <= 89){
            return 3;
        }
        else if (average >= 70 && average <= 79){
            return 2;
        }
        else if (average >= 60 && average <= 69)
        {
            return 1;
        }
        else
            return 0;
    }
}
