package chapterSix;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the number: ");
            firstNum = scan.nextInt();
            System.out.println("Enter the number: ");
           secondNum = scan.nextInt();
            boolean isMutiple = isMultiple(firstNum, secondNum);
            System.out.println(isMutiple);
            System.out.println("Press Any Number to continue and -1 to quit");
            }
        while ((firstNum = scan.nextInt()) != -1);
        }

    public static boolean isMultiple(int firstNum, int secondNum){
        if (firstNum % secondNum == 0){
            return true;
        }
        return false;
    }
}
