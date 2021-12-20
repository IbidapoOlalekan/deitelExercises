package chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberArrayList {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
    }

    public static int[] getIntegers(int numbers){
        System.out.println("Enter A Number Or -1 To Quit: ");
        int[]values  = new int[numbers];
        for (int i = 0; i  < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }


}
