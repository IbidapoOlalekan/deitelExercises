package practiceDeitel;

public class SumOddRange {
    public static boolean isOdd(int number) {
        return (number > 0) && (number % 2 != 0);
    }


    public static int sumOdd(int start, int end) {
        int total = 0;
        if (start > 0 && end > 0 && end >= start){
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    total += i;
                }
            }
            return total;
        }
        else {
            return -1;
        }

    }
}
