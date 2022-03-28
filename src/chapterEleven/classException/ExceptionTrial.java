package chapterEleven.classException;

import chapterEleven.DivideByZeroWithExceptionHandling;

import java.util.Scanner;

import static myerBriggs.MyerBriggs.display;

public class ExceptionTrial {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws ExceptionA {
        int number  = input("Enter a Number: ");
        int divisor = input("Enter the divisor: ");
        int answer;
        boolean continueLoop = true;
       do {
           try{
              int  result =  divide(number,divisor);
               System.out.printf("The result is %d",result);
               continueLoop = false;
           } catch(Exception e){
               System.err.printf("The error is %s%n ", "InputMismatch Exception");
           }
       }
       while(continueLoop);
    }

    private static void display(int divide) {
        System.out.println(divide);
    }
    private static void display(String message){
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scan.nextInt();
    }

    public static int divide (int number, int divisor) throws ArithmeticException{
            return number/divisor;
    }
}
