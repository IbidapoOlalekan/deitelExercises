package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void firstTest(){
        Time time = new Time();
        time.setTime(23,12,13);

        System.out.println(time);
    }
}