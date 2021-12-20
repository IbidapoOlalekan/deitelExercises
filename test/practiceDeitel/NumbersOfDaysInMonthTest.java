package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersOfDaysInMonthTest {
    @Test
    public void checkIfYearIsLeapYearTest(){
        int year = 2000;
        boolean isLeapYear = NumbersOfDaysInMonth.isLeapYear(year);
        assertTrue(isLeapYear);
    }
    @Test
    public void checkIfYearLessThanOneAndGreaterThanNineThousandAndNineHundredAndNinetyNine(){
        int year = 0;
        boolean isLeapYear = NumbersOfDaysInMonth.isLeapYear(year);
        assertFalse(isLeapYear);
        year = 10000000;
        isLeapYear = NumbersOfDaysInMonth.isLeapYear(year);
        assertFalse(isLeapYear);

    }

    @Test
    public void getDaysIfMonthIsNotBetweenRangeOfOneAndTwelve(){
        int month = 13;
        int year = 2000;
        int value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(-1,value);
        month = -2;
        year = 2000;
        value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(-1,value);
    }
    @Test
    public void getDaysIfYearIsNotInRangeOfOneAndNineThousandNineHundredAndNinetyNine(){
        int month = 12;
        int year = 1000000;
        int value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(-1,value);
    }
    @Test
    public void getDaysInMonthTest(){
        int month = 12;
        int year = 2004;
        int value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(31,value);
    }
    @Test
    public void getDaysInALeapYearTest(){
        int year = 2000;
        boolean isLeapYear = NumbersOfDaysInMonth.isLeapYear(year);
        assertTrue(isLeapYear);
        int month = 2;
        int value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(29,value);
    }
    @Test
    public void getDaysInANonLeapYearTest(){
        int year = 2001;
        boolean isLeapYear = NumbersOfDaysInMonth.isLeapYear(year);
        assertFalse(isLeapYear);
        int month = 2;
        int value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(28,value);
    }
    @Test
    public void getDaysInAThirtyDayMonthTest(){
        int year = 2005;
        int month = 4;
        int value = NumbersOfDaysInMonth.getDaysInMonth(month,year);
        assertEquals(30,value);
    }

}
