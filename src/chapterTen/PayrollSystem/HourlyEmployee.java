package chapterTen.PayrollSystem;

import chapterEight.Date;

public class HourlyEmployee extends Employee{
    public double wage;
    public double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage < 0.0) throw new IllegalArgumentException("Hourly Wages must be greater than zero");
        if((hours < 0.0) || (hours > 168.0)) throw new IllegalArgumentException("Hours worked must be greater than zero and less than One hundred and sixty eight");
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly Wages must be greater than zero");

        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be greater than zero and less than One hundred and sixty eight");

        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;

    }

    @Override
    public String toString() {
        return String.format("Hourly employee: %s%n%s: #%,.2f; %s: %,.2f",super.toString(),"Hourly wages",getWage(),"Hours worked",getHours());
    }
}
