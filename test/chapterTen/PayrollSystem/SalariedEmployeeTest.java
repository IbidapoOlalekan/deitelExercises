package chapterTen.PayrollSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalariedEmployeeTest {
    SalariedEmployee employee;
    @BeforeEach
    public void setUp(){
        employee = new SalariedEmployee("Olalekan", "Ibidapo", "0254836708",500000);
    }

    @Test void employeeFirstNameTest() {
        assertEquals("Olalekan",employee.getFirstName());
    }

    @Test void employeeLastNameTest() {
        assertEquals("Ibidapo",employee.getLastName());
    }

    @Test void employeeSsnNumberTest() {
        assertEquals("0254836708",employee.getSocialSecurityNumber());
    }

    @Test void employeeSalaryTest() {
        assertEquals(500000,employee.earnings());
    }

    @Test void employeeSalaryCannotBeLessThanZero_throwsException() {
        assertThrows(IllegalArgumentException.class,()-> employee.setWeeklySalary(0));
    }

    @Test void toStrings(){
        System.out.println(employee.toString());
    }
}