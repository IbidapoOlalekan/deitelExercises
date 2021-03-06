package chapterTen.PayrollSystem;

import chapterEight.Date;

public class SalariedEmployee extends Employee{


    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (weeklySalary <= 0.0) throw new IllegalArgumentException("Weekly salary must be greater than 0.0");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary <= 0.0)throw new IllegalArgumentException("Weekly salary must be greater than zero");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
       return String.format("Salaried employee: %s%n%s: #%,.2f",super.toString(),
               "Weekly salary", getWeeklySalary());
    }
}
