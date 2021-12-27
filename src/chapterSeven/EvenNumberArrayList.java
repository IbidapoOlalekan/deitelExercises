package chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberArrayList {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput;
        int count ;
        int maxEven = 0 ;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        do {
            System.out.println("Enter a Number");
            userInput = scanner.nextInt();

            numbers.add(userInput);
            count = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    count ++;
                    if (maxEven < numbers.get(i)){
//                        Math.max(numbers.get(i),maxEven);
                        maxEven = numbers.get(i);
                    }
                }


            }

        }
        while (userInput != -1);
        System.out.println("The number of even numbers are " + count);
        System.out.println("The maximum Even Number is " + maxEven);
    }




}
