package kata;

import java.util.IllegalFormatCodePointException;

public class Cata {

    public static char calculateGradeFor(int score){
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';

        return 'F';

    }

    public int calculatePriceFor(int numberOfQuantities){
        if (numberOfQuantities >= 1 && numberOfQuantities <= 4){
            return numberOfQuantities *  2000;

        }
        if (numberOfQuantities >= 5 && numberOfQuantities <= 9){
            return numberOfQuantities * 1800;

        }
        if(numberOfQuantities >= 10 && numberOfQuantities <= 29){
            return  numberOfQuantities * 1600;
        }
        if (numberOfQuantities >= 30 && numberOfQuantities <= 49){
            return numberOfQuantities * 1500;
        }
        if (numberOfQuantities >= 50 && numberOfQuantities <= 99){
            return numberOfQuantities * 1300;
        }
        if (numberOfQuantities >= 100 && numberOfQuantities <= 199){
            return numberOfQuantities * 1200;
        }
        if (numberOfQuantities >= 200 && numberOfQuantities <= 499){
            return numberOfQuantities * 1100;
        }
        return numberOfQuantities * 1000;
    }

}
