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

}
