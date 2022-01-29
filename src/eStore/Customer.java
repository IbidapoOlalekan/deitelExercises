package eStore;

public class Customer extends User{

    private  Billing billingInformation;
    private ShoppingCart shoppingCart;
    public Customer(String name, int age) {
        super(name, age);
    }

}
