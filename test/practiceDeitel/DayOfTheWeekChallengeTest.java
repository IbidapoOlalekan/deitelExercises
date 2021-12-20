package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfTheWeekChallengeTest {
    @Test
    public void sundayCanBePrinted(){
      String day =   DayOfTheWeekChallenge.printDayOfTheWeek(0);
      assertEquals("Sunday",day);
    }
    @Test
    public void mondayCanBePrinted(){
        String day =   DayOfTheWeekChallenge.printDayOfTheWeek(1);
        assertEquals("Monday",day);
    }
    @Test
    public void tuesdayCanBePrinted(){
        String day =   DayOfTheWeekChallenge.printDayOfTheWeek(2);
        assertEquals("Tuesday",day);
    }
    @Test
    public void wednesdayCanBePrinted(){
        String day =   DayOfTheWeekChallenge.printDayOfTheWeek(3);
        assertEquals("Wednesday",day);
    }
    @Test
    public void thursdayCanBePrinted(){
        String day =   DayOfTheWeekChallenge.printDayOfTheWeek(4);
        assertEquals("Thursday",day);
    }
    @Test
    public void fridayCanBePrinted(){
        String day =   DayOfTheWeekChallenge.printDayOfTheWeek(5);
        assertEquals("Friday",day);
    }
    @Test
    public void saturdayCanBePrinted(){
        String day =   DayOfTheWeekChallenge.printDayOfTheWeek(6);
        assertEquals("Saturday",day);
    }
    @Test
    public void invalidDayCannotBePrinted(){
            String day =   DayOfTheWeekChallenge.printDayOfTheWeek(15);
            assertEquals("Invalid Day",day);

    }





}
