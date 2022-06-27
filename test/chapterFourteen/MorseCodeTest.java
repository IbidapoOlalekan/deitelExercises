package chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    MorseCode code;
    @BeforeEach
    void setUp(){
        code = new MorseCode();
    }

    @Test
    void morseCodeExists(){
        assertNotNull(code);
    }

    @Test void wordCanBeConvertedToMorseCode(){
        String word  = "Bald";
       String ba = code.convertToMorseCode(word);
        assertEquals("-... .- .-.. -.. ",ba);
    }

}