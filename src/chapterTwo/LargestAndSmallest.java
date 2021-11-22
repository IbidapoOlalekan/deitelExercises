package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first integers: ");
        int firstInteger= scan.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger= scan.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger= scan.nextInt();

        System.out.print("Enter fourth integer: ");
        int fourthInteger= scan.nextInt();

        System.out.print("Enter fifth integer: ");
        int fifthInteger= scan.nextInt();

        int largestNumber=0;
        int smallestNumber=firstInteger;
        int numberStore;
        if(firstInteger > largestNumber ){
            largestNumber = firstInteger;
        }
        if(smallestNumber > firstInteger){
            smallestNumber= firstInteger;
        }
        if(secondInteger > largestNumber ){
            largestNumber = secondInteger;

        }
        if(secondInteger < smallestNumber){
            smallestNumber=secondInteger;
        }
        if(thirdInteger > largestNumber ){
            largestNumber = thirdInteger;
        }
        if(thirdInteger < smallestNumber){
            smallestNumber=thirdInteger;
        }
        if(fourthInteger > largestNumber ){
            largestNumber = fourthInteger;
        }
        if(fourthInteger < smallestNumber){
            smallestNumber=fourthInteger;
        }
        if(fifthInteger > largestNumber ){
            largestNumber = fifthInteger;
        }
        if(fifthInteger < smallestNumber){
            smallestNumber=fifthInteger;
        }

        System.out.println(largestNumber);
        System.out.println(smallestNumber);
    }
}
