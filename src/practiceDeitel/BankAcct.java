package practiceDeitel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAcct {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public  void deposit(double depositAmount){
        if (depositAmount > 0){
            balance = depositAmount + balance;
            String.format("You deposited %.2f to %s account",depositAmount,getCustomerName());
        }
        else {
            this.balance = balance;
            String.format("Deposit Amount cannot be negative");
        }
    }

    public void withdrawal(double withdrawalAmount){
        if (withdrawalAmount > balance || withdrawalAmount < 0){
            withdrawalAmount = 0;
            this.balance = balance;
            System.out.println("Insufficient Funds!");
        }

        balance = balance - withdrawalAmount;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{10}"))
        this.accountNumber = accountNumber;
        else
            System.out.println("Invalid Account Number");
    }

    public double getBalance() {
        return balance;
    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email.toLowerCase();
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (isValidMobileNo(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }
       else
            System.out.println("Invalid Phone Number");
    }

    public static boolean isValidMobileNo(String str){
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = pattern.matcher(str);

        return (match.find() && match.group().equals(str));
    }
}
