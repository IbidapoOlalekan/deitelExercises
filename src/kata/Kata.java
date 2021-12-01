package kata;

public class Kata {

    public char getGrade(int score){
        char grade = ' ';
        if (score >= 90)  return 'A';
        else if (score >= 80 ) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else if (score >= 50) return 'E';
        else return 'F';
    }
}
