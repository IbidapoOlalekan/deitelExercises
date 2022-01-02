package chapterFive;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int userInput;
        do {
            System.out.println("Enter A Number: ");
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
            System.out.println();
        }
        else
            System.out.println("Invalid Number Of Figures");

    }
}
