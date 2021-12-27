package chapterSix;

public class Exponentiation {
    public static void main(String[] args) {
       int power  = integerPower(3,3);
        display("The answer is "+ power);

    }
    public static int integerPower(int base,int exponent){
        int product = 1;
        for (int i = 1; i <= exponent; i++)
        {
         product *= base;
        }
        return product;
    }

    public static String display(String message){

        System.out.println(message);
        return message;
    }
}
