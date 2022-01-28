package chapterSix;

import java.util.Scanner;

public class Minimum {
    private static final Scanner scanner = new Scanner(System.in);


    public static float minimum3(float num1, float num2, float num3){
        return Math.min(Math.min(num2,num3),num1);
    }

    public static float input(String message){
        display(message);
        return (float) scanner.nextDouble();
    }
    public static void display(String message){
        System.out.println(message);
    }

}
