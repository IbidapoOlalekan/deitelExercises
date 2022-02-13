package chapterNine.employeeHierachy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Employee")
class BasePlusCommissionEmployeeTest {
    Employee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new Employee("Olalekan","Ibidapo","196-54-1965");

    }

    @DisplayName("Can Have A FirstName")
    @Test
    public void EmployeeCanBeCreated() throws Exception {

        assertEquals("Olalekan",employee.getFirstName());

    }
    @DisplayName("Can Have A LastName")
    @Test
    public void EmployeeCanHaveLastName() throws Exception{
        String lastName = "Ibidapo";
        assertEquals(employee.getLastName(),lastName);
    }

    @DisplayName("Can Have A Social Security Number")
    @Test
    public void employeeCanHaveASocialSecurityNumber() throws Exception{
        String socialSecurityNumber = "196-54-1965";
        assertEquals(employee.getSocialSecurityNumber(),socialSecurityNumber);
    }

    @DisplayName("Details ")
    @Test
    public void employeeDetails() throws Exception{
        employee.toString();
        out.println(employee.toString());
    }

    @DisplayName("Can Be On Commission")
    @Test
    public void commissionEmployees() throws Exception{
        double commission = 1.5;
        CommissionEmployee commissionEmployee  = new CommissionEmployee("Ola","Ola","123-434-3456");
        assertThrows(IllegalArgumentException.class,()-> commissionEmployee.setCommissionRate(commission));
    }
}