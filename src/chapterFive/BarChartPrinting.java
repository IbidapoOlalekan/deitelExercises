package chapterFive;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class BarChartPrinting {
    private static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int count = 1;
        int userInput;
        do {
            display("Enter A Number: ");
            userInput = scanner.nextInt();
            displayBar(userInput);

            count++;
        }
        while (count <= 5);
    }

    public static void displayBar(int numbers){
        if (numbers >= 1 && numbers <= 30){
            for (int i = 0 ; i < numbers;i++){
                System.out.print("*");

            }
            display("");
        }
        else
            display ("Invalid Number Of Figures");


    }

    public static void display(String message){
        System.out.println(message);
    }

}
