package chapterFourteen;

import java.util.Scanner;

public class PigLatinWord {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       String[] character =  input("Enter a sentence and I will convert it to pig latin: ");

       for (String word : character) {

       }

    }


    public static String printLatinWord(String word){
        StringBuilder result = new StringBuilder(word);
        Character character = result.charAt(0);
        result.insert(result.length(), character);
        result.append("ay");
        return result.substring(1);
    }

    public static String[] input(String message){
        System.out.println(message);
        return scan.nextLine().split("");
    }

}
