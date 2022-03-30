package chapterSeventeen;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EvenSum {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10).filter(number-> number %2 == 0).map(number-> number*3).sum());

        System.out.println(IntStream.rangeClosed(1,5).map(number-> number*6).sum());

        System.out.println(IntStream.rangeClosed(1,10).map(number-> number*2).sum());

        System.out.println(IntStream.rangeClosed(1,10).summaryStatistics());
    }
}
