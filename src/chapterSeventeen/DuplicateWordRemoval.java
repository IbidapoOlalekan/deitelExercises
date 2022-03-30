package chapterSeventeen;


import java.util.Arrays;

public class DuplicateWordRemoval {

    public static void displayUniqueWords(String sentence){
        sentence = sentence.toLowerCase();
        Arrays.stream(sentence.split(" "))
                .distinct()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
     displayUniqueWords("The boy is just a boy");
    }
}
