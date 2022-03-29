package chapterSixteen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateWordsTest {
    @DisplayName("Duplicate Words In A Sentence")
    @Test void duplicateWords(){
        DuplicateWords duplicate = new DuplicateWords();
       int numberOfTimes =  duplicate.returnNumberOfDuplicate("The football match has ten football players, a goalkeeper, the football field, and some youth players");
       assertEquals(2, numberOfTimes);
    }

}