package chapterTen.PayrollSystem;

import chapterEight.Date;

public class BasePlusCommissionEmployee extends CommissionedEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber,birthDate,grossSales, commissionRate);
        if (baseSalary < 0.0) throw new IllegalArgumentException("Base Salary must be greater than or equal to zero");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) throw new IllegalArgumentException("Base Salary must be greater than or equal to zero");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
    return String.format("%s %s; %s: #%, .2f","Base-salaried",super.toString(), "Base salary", getBaseSalary());

    }
}
