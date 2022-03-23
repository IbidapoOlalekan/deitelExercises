package chapterTen.PayrollSystem;

public class CommissionedEmployee extends Employee{

    public double grossSales;
    public double commissionRate;
    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException("Commission must be greater than zero and less than one");
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be greater than or equal to zero");
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be greater than or equal to zero");

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException("Commission must be greater than zero and less than one");

        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
      return String.format("\"%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(),"gross sales", getGrossSales(),"commission rate", getCommissionRate());
    }
}
