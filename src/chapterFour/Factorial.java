package chapterFour;

import java.util.Scanner;

public class Factorial {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

      int result =  factorialOf(5);
      double results = factorialOf(4.0);
        System.out.println(results);

    }
    public static int factorialOf(int number){
        if (number >= 0) {
            int factorial = 1;
            for (int count = 0; number > count; number--) {
                factorial *= number;
            }

            return factorial;
        }
        else {
            return -1;
        }


    }

    public static double factorialOf(double number){
        if (number < 1){
            return 0;
        }
        else if (number == 1){
            return 1;
        }
        else {
            return number * factorialOf(number - 1);
        }

    }

}
