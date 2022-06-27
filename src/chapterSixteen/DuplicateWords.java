package chapterSixteen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {
    public int returnNumberOfDuplicate(String sentence) {
        sentence = sentence.toLowerCase();
        String[] array = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : array) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        int countOfDuplicates = 0;
        for (String key : wordCount.keySet()) {
            if(wordCount.get(key) > 1){
                countOfDuplicates++;
            }
        }
        return countOfDuplicates;
    }
}
