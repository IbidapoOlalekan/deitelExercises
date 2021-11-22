package chapterTwo;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int numThree = scan.nextInt();
        int numFour = scan.nextInt();
        int numFive = scan.nextInt();
        int count = 0;
        int counts = 0;
        int counter = 0;

        if(numOne < 0){
            count ++;
        }
        if(numTwo < 0){
            count++;
        }
        if (numThree < 0){
            count ++;
        }
        if (numFour < 0){
            count++;
        }
        if(numFive < 0){
            count++;
        }

        System.out.println("The number of negative values is " + count);
        if(numOne > 0){
            counts ++;
        }
        if(numTwo > 0){
            counts++;
        }
        if (numThree > 0){
            counts ++;
        }
        if (numFour > 0){
            counts++;
        }
        if(numFive > 0){
            counts++;
        }

        System.out.println("The number of positive values is " + counts);
        if(numOne == 0){
            counter ++;
        }
        if(numTwo == 0){
            counter++;
        }
        if (numThree == 0){
            counter ++;
        }
        if (numFour == 0){
            counter++;
        }
        if(numFive == 0){
            counter++;
        }
        System.out.printf("The number of zeros input are %d", counter);
    }

}
