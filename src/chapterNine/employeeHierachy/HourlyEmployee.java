package chapterNine.employeeHierachy;

public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double wages;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }
}
