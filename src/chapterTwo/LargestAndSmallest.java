package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    private static final Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {

        int firstInteger= input("Enter first Integer: ");

        int secondInteger= input("Enter second Integer: ");

        int thirdInteger= input("Enter third Integer");

        int fourthInteger= input("Enter fifth Integer: ");

        int fifthInteger= input("Enter fifth Integer: ");

        int largestNumber=0;
        int smallestNumber=firstInteger;

        boolean firstNumberIsTheLargest = firstInteger > largestNumber;
        boolean firstNumberIsTheSmallest = false;
        if(firstNumberIsTheLargest) largestNumber = firstInteger;

        if(firstNumberIsTheSmallest) smallestNumber = firstInteger;

        boolean secondNumberIsTheLargest = secondInteger > largestNumber;
        boolean secondNumberIsTheSmallest = secondInteger < smallestNumber;

        if(secondNumberIsTheLargest) largestNumber = secondInteger;

        if(secondNumberIsTheSmallest) smallestNumber=secondInteger;

        boolean thirdNumberIsTheLargest = thirdInteger > largestNumber;
        boolean thirdNumberIsTheSmallest = thirdInteger < smallestNumber;
        if(thirdNumberIsTheLargest ) largestNumber = thirdInteger;

        if(thirdNumberIsTheSmallest) smallestNumber = thirdInteger;

        boolean fourthNumberIsTheLargest = fourthInteger > largestNumber;
        boolean fourthNumberIsTheSmallest = fourthInteger < smallestNumber;

        if(fourthNumberIsTheLargest ) largestNumber = fourthInteger;

        if(fourthNumberIsTheSmallest) smallestNumber = fourthInteger;

        boolean fifthNumberIsTheLargest = fifthInteger > largestNumber;
        boolean fifthNumberIsTheSmallest = fifthInteger < smallestNumber;
        if(fifthNumberIsTheLargest ) largestNumber = fifthInteger;

        if(fifthNumberIsTheSmallest) smallestNumber = fifthInteger;


        display("The largest number is" + largestNumber);
        display("The smallest number is" +smallestNumber);
    }

    public static int input(String message){
        System.out.println(message);
        return scan.nextInt();
    }
    public static void display(String message){
        System.out.println(message);
    }
    public static void display(int message){
        System.out.println(message);
    }
}
