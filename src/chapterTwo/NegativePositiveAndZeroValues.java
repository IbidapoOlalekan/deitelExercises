package chapterTwo;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int numberOne = input("Enter A Number: ");
        int numberTwo = input("Enter A Number: ");
        int numberThree = input("Enter A Number: ");
        int numberFour = input("Enter A Number: ");
        int numberFive = input("Enter A Number: ");
        int count = 0;
        int counts = 0;
        int counter = 0;

        boolean numberOneIsLessThanZero = numberOne < 0;
        boolean numberTwoIsLessThanZero = numberTwo < 0;
        boolean numberThreeIsLessThanZero = numberThree < 0;
        boolean numberFourIsLessThanZero = numberFour < 0;
        boolean numberFiveIsLessThanZero = numberFive < 0;
        if(numberOneIsLessThanZero){
            count ++;
        }
        else if(numberTwoIsLessThanZero){
            count++;
        }
        else if (numberThreeIsLessThanZero){
            count ++;
        }
        else if (numberFourIsLessThanZero){
            count++;
        }
        else if(numberFiveIsLessThanZero){
            count++;
        }

        System.out.println("The number of negative values is " + count);
        if(numberOne > 0){
            counts ++;
        }
        if(numberTwo > 0){
            counts++;
        }
        if (numberThree > 0){
            counts ++;
        }
        if (numberFour > 0){
            counts++;
        }
        if(numberFive > 0){
            counts++;
        }

        System.out.println("The number of positive values is " + counts);
        if(numberOne == 0){
            counter ++;
        }
        if(numberTwo == 0){
            counter++;
        }
        if (numberThree == 0){
            counter ++;
        }
        if (numberFour == 0){
            counter++;
        }
        if(numberFive == 0){
            counter++;
        }
        System.out.printf("The number of zeros input are %d", counter);
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }

}
