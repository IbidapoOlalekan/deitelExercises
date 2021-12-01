package kata;

import java.util.IllegalFormatCodePointException;

public class Cata {

    public char calculateGradeFor(int score){
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';

        return 'F';

    }

    public int calculatePriceFor(int numberOfQuantities){
        if (numberOfQuantities >= 1 && numberOfQuantities <= 4){
            int price = numberOfQuantities *  2000;
            return price;
        }
        if (numberOfQuantities >= 5 && numberOfQuantities <= 9){
            int price = numberOfQuantities * 1800;
            return price;
        }
        return numberOfQuantities * 5000;
    }

}
