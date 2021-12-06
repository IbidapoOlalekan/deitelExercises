package chapterSix;

public class ArithmeticMain {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int sum = arithmetic.add(2,4);
        double doubleSum = arithmetic.add(2.4,4.5);
        int newSum = arithmetic.add(2,3,(int)3.4);
        System.out.println(sum + " " + doubleSum + " " + newSum);
    }
}
