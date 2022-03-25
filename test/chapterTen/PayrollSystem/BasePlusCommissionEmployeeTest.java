package chapterTen.PayrollSystem;

import chapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasePlusCommissionEmployeeTest {
    BasePlusCommissionEmployee employee;
    @BeforeEach
    public void setUp(){
        Date date = new Date(2021,3,24);
        employee = new BasePlusCommissionEmployee("Shola","Azeez","00000000",date,5000,0.5,30000);
    }

    @Test void firstNameTest(){
        assertEquals("Shola",employee.getFirstName());
    }
    @Test void employeeLastNameTest() {
        assertEquals("Azeez",employee.getLastName());
    }

    @Test void commissionEmployeeSecurityNumber() {
        assertEquals("00000000",employee.getSocialSecurityNumber());
    }
    @Test void grossSalesTest(){
        assertEquals(5000,employee.getGrossSales());
    }
    @Test void commissionRateTest(){
        assertEquals(0.5,employee.getCommissionRate());
    }
    @Test void commissionCannotBeLessThanZeroAndGreaterThanOne_throwsException() {
        assertThrows(IllegalArgumentException.class,()-> employee.setCommissionRate(10));
    }

    @Test void baseSalaryTest() {
        assertEquals(30000,employee.getBaseSalary());
    }
    @Test void employeeSalaryCannotBeLessThanZero_throwsException() {
        assertThrows(IllegalArgumentException.class,()->employee.setBaseSalary(-10));
    }

    @Test void earningOfBasePlusCommissionEmployee(){
        assertEquals(32500,employee.earnings());
    }
}