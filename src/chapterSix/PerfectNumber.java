package chapterSix;

public class PerfectNumber {
    public static void main(String[] args) {
      for (int i = 1; i <= 2000; i ++){
          boolean isPerfect = isPerfect(i);

      }

    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number ; i++){
            if (number % i == 0){
                sum += i ;

            }
        }
        if (sum == number){

            System.out.println( number);
            return true;
        }
        return false;
    }
}
