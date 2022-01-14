package chapterFour;

public class Factorial {
    public static void main(String[] args) {
      int result =  factorialOf(5);
      double results = doubleFactorial(4);
        System.out.println(results);

    }
    public static int factorialOf(int number){
        if (number >= 0) {
            int product = 1;
            for (int count = 0; number > count; number--) {
                product *= number;
            }

            return product;
        }
        else {
            return -1;
        }


    }

    public static double doubleFactorial(int number){
        if (number < 1){
            return 0;
        }
        else if (number == 1){
            return 1;
        }
        else if (number > 1){
            return number * doubleFactorial(number - 1);
        }
        return 0;
    }

}
