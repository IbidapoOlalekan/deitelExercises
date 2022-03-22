package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinWordTest {
    @Test
    void testCanPrintLatinWords(){
        PigLatinWord word = new PigLatinWord();
        String newWord = word.printLatinWord("Jump");
        assertEquals("umpJay",newWord);
    }

}