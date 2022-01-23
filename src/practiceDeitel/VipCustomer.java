package practiceDeitel;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    public VipCustomer(){
        this("Default Name",0.00,"Default@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(String name, double creditLimit){
       this(name,creditLimit, "unknown email Address");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
