package chapterFour;

public class MultiplesOfTwoWithInfiniteLoops {
    public static void main(String[] args) {
        int multiplesOfTwo = 1;
        for(int i  = 1; ;i++ ){
            i *= 2;

            System.out.println(i );
        }

    }

}
