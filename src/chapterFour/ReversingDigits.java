package chapterFour;

public class ReversingDigits {
    public static void main(String[] args) {
       int reverse =  reverseNumber(2312);
        System.out.println(reverse);
    }
public static int reverseNumber(int number){
    int reversed  = 0;
    while (number != 0){
        int digit = number % 10;

        reversed = reversed * 10 + digit;

        number /= 10;
    }

    return reversed;
}
}
