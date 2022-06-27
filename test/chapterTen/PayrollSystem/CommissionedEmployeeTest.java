package chapterTen.PayrollSystem;

import chapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionedEmployeeTest {
    CommissionedEmployee employee;
    @BeforeEach
    public void setUp(){
        Date date = new Date(2021,3,24);
        employee = new CommissionedEmployee("Shola","Azeez","00000000",date,5000,0.5);
    }

    @Test void commissionedEmployeeFirstName() {
        assertEquals("Shola",employee.getFirstName());
    }

    @Test void commissionedEmployeeLastName(){
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

    @Test void earningsTest(){
        assertEquals(2500,employee.earnings());
    }

    @Test void setGrossSalesTest(){
        employee.setGrossSales(3000);
        assertEquals(3000,employee.getGrossSales());
    }
}