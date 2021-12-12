package practiceDeitel;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
       numberCounter();

        int sum = 0 ;
        for (int i = 1; i < 10; i ++){
            sum+= i ;
        }
        System.out.println("The sum of the first ten natural numbers is" + sum);
        System.out.println("******************************");


        Scanner scan = new Scanner(System.in);
        display("Enter a positive integer:");
        int userInput = scan.nextInt();
        multiplicationTableOf(userInput);


        display("Enter A Positive Integer: ");
        int input;
        input = scan.nextInt();
        factorialOf(input);

        System.out.println("Enter the base number: ");
        int baseNumber =scan.nextInt();
        System.out.println("Enter the power: ");
        int power = scan.nextInt();
        powerOf(baseNumber,power);


    }

    public static void factorialOf(int input){
        int factorial = 1;
        for ( int i = 1;i <= input ; i++){

            factorial*=i;
        }
        display("The factorials are " + factorial);
    }

    public static void multiplicationTableOf(int number){
        display("Multiplication Table");
        for (int i = 1; i < 13; i++){
            int multiplication = number * i;
            display(number + " x " + i + " = "  + multiplication);
        }
        display("**********************");
    }

    public static void display(String message){
        System.out.println(message);

    }
    public static void numberCounter(){
        //To print from number one to ten
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        display("*******************");
    }

    public static void powerOf(int firstNum, int secondNum){

            int result  =1;
//
        for (int i = 1; i <= secondNum; i++){
            result*=firstNum;
        }
        System.out.println("The result is " + result);
    }



}
