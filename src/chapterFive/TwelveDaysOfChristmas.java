package chapterFive;


import java.util.Scanner;

public class TwelveDaysOfChristmas {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      int userInput =  input("Enter a Number: ");
      int secondUserInput = input("Enter A Number: ");
      int sum =   Math.addExact(userInput,secondUserInput);

        System.out.println("The sum is "+ sum);

    }
    public static int input(String message){
        System.out.println(message);
        int userInput = scanner.nextInt();
        return userInput;
    }
}