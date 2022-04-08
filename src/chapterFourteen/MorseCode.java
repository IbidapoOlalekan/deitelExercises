package chapterFourteen;

import java.util.Scanner;

public class MorseCode {
    private static final Scanner scanner = new Scanner(System.in);


     String convertToMorseCode(String word) {
        String[] morseWords = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---"
        ,".--.","--.-",".-.","-","..-","...-",".--","-..-","-.--","--.."};
        word = word.toUpperCase();
        String[]token = word.split(" ");

        StringBuilder wordMorser = new StringBuilder();

        for (int i = 0; i < token.length; i++){
            for (int j = 0; j < token[i].length(); j++){
                for (int z = 0; z < 26; z++){
                    if (token[i].charAt(j) == 'A' + z){
                        wordMorser.append(morseWords[z]).append(" ");
                    }
                }
            }
        }
        return wordMorser.toString();
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static String input(String message){
        display(message);
        return scanner.nextLine();
    }

}
