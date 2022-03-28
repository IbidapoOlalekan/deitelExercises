package chapterTen.PayrollSystem;

import chapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static assignments.GuessGame.display;
import static org.junit.jupiter.api.Assertions.*;

class PieceWorkerTest {
    PieceWorker employee;
    @BeforeEach
    public void setUp(){
        Date date = new Date(2021,3,24);
        employee = new PieceWorker("Olalekan", "Ibidapo", "0254836708",date,20,500);
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

    @Test void employeeWagesTest() {
        assertEquals(20,employee.getWages());
    }

    @Test void employeeWagesCannotBeLessThanOrEqualTOZero_throwsException() {
        assertThrows(IllegalArgumentException.class,()->employee.setWages(0));
    }

    @Test void employeePiecesTest(){
        assertEquals(500,employee.getPieces());
    }

    @Test void employeeSalaryCannotBeLessThanZero_throwsException() {
        assertThrows(IllegalArgumentException.class, ()-> employee.setPieces(0));
    }

    @Test void employeePieceWorkerEarningTest() {
        assertEquals(10000,employee.earnings());
    }

    @Test void employeeToString(){
        display(employee.toString());
    }



}