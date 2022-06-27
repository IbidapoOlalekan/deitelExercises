package chapterFourteen;

import java.security.SecureRandom;
import java.util.Random;

public class RandomSentence {
    public static void main(String[] args) {
        String[] article = {"the","a","one","some","any"};
        String[] noun = {"boy","girl","dog","town","car"};
        String[] verb = {"jumped","drove","ran","walked","skipped"};
        String[]prepositions = {"to","from","over","under","on"};

        String[] sentence = new String[20];

        SecureRandom r = new SecureRandom();

        for (int i = 0; i < 20; i++){
           String art = article[r.nextInt(5)];

           art = art.replaceFirst(art.substring(0,1),art.substring(0,1).toUpperCase());

           sentence[i] = String.format("%s %s %s %s %s %s ", art, noun[r.nextInt(5)], verb[r.nextInt(5)], prepositions[r.nextInt(5)], article[r.nextInt(5)],
                   noun[r.nextInt(5)]);
        }

        for (int i =0 ; i < sentence.length; i++){
            System.out.printf("%d Phrase: %s%n", i + 1, sentence[i]);
        }
    }
}
