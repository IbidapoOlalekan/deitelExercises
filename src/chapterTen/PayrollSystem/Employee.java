package chapterTen.PayrollSystem;

import chapterEight.Date;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
     return String.format("%s %s%nSocial security number: %s%nBirthDate: %s ",getFirstName(), getLastName(), getSocialSecurityNumber(),getBirthDate());
    }

    public abstract double earnings();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
