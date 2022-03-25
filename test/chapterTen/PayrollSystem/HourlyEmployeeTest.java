package chapterTen.PayrollSystem;

import chapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    HourlyEmployee employee;
    @BeforeEach
    public void setUp() {
        Date date = new Date(2021,3,24);
        employee = new HourlyEmployee("Olalekan", "Ibidapo", "0254836708",date,20,500);
    }
    @Test
    void employeeFirstNameTest() {
        assertEquals("Olalekan",employee.getFirstName());
    }

    @Test void employeeLastNameTest() {
        assertEquals("Ibidapo",employee.getLastName());
    }

    @Test void employeeSsnNumberTest() {
        assertEquals("0254836708",employee.getSocialSecurityNumber());
    }

    @Test void employeeWorkHourTest() {
        assertEquals(20,employee.getHours());
    }

    @Test void employeeWorkHourCannotBeLessThanZeroAndGreaterThanOneHundredAndSixtyEight_throwsException() {
        assertThrows(IllegalArgumentException.class,()->employee.setHours(168.7));
    }

    @Test void employeeWageTest(){
        assertEquals(500,employee.getWage());
    }

    @Test void employeeWageCannotBeLessThanZero_throwsException(){
        assertThrows(IllegalArgumentException.class,()->employee.setWage(-10));
    }

    @Test void hourlyEarningTest(){
        assertEquals(10000,employee.earnings());
    }

    @Test void hourlyEarningIfHoursMoreThanForty() {
        employee.setHours(50);
        assertEquals(27500,employee.earnings());
    }

    @Test void display(){
        System.out.println(employee.toString());
    }
}