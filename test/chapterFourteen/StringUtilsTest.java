package chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils stringUtils;
    @BeforeEach
    public void setUp(){
        stringUtils = new StringUtils("Book");
    }
    @Test
    void stringCountTest() {
       int count =  stringUtils._countOf('o');
        assertEquals(2, count);
    }

    @Test
    void stringIndexOfTest(){
        int count = stringUtils._indexOf('B');
        assertEquals(0,count);
    }

    @Test
    void stringIndexDoesntExistTest(){
        int count = stringUtils._indexOf('b');
        assertEquals(-1,count);
    }
    @Test
    void stringIndexEqualIgnoreCaseTest(){
        int count = stringUtils._indexOf(true,'b');
        assertEquals(0,count);
    }
    @Test
    void stringIndexEqualIgnoreCaseFalseTest(){
        int count = stringUtils._indexOf(false,'b');
        assertEquals(-1,count);
    }

    @Test
    void stringLastIndexTest(){
        int count = stringUtils._lastIndexOf('o');
        assertEquals(2,count);
    }

    @Test
    void stringLastIndexIgnoreCaseTest(){
        int count = stringUtils._lastIndexOf(true,'o');
        assertEquals(2,count);
    }

    @Test
    void stringLastIndexDoesntExistTest(){
        int count = stringUtils._lastIndexOf('r');
        assertEquals(-1,count);
    }
}