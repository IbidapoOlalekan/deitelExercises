package practiceDeitel;

import chapterEight.Time;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAcct {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAcct(){

    }


    public BankAcct(String customerName, String phoneNumber){
        this(customerName,phoneNumber,null);
    }
    public BankAcct(String customerName,String phoneNumber,String accountNumber ){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public  void deposit(double depositAmount){
        validationOf(depositAmount);
    }

    private void validationOf(double depositAmount) {
        if (depositAmount > 0){
            balance = depositAmount + balance;
            String.format("You deposited %.2f to %s account", depositAmount,getCustomerName());
        }
        else {
            this.balance = balance;
            String.format("Deposit Amount cannot be negative");
        }
    }

    public void withdrawal(double withdrawalAmount){

        withdrawalAmount = getWithdrawalAmount(withdrawalAmount);

        balance = balance - withdrawalAmount;

    }

    private double getWithdrawalAmount(double withdrawalAmount) {
        if (withdrawalAmount > balance || withdrawalAmount < 0){
            withdrawalAmount = 0;
            display("Insufficient Funds!");
        }
        return withdrawalAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        validate(accountNumber);
    }

    private void validate(String accountNumber) {
        if (accountNumber.matches("\\d{10}"))
        this.accountNumber = accountNumber;
        else
            display("Invalid Account Number");
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
        check(email);
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
            display("Invalid Phone Number");
    }


    public static boolean isValidMobileNo(String str){
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = pattern.matcher(str);

        return (match.find() && match.group().equals(str));
    }
    @Override
    public String toString(){
        return "Account Name: " + getCustomerName() + "\n Phone Number: " + getPhoneNumber() ;
    }

    public static String display(String message){return message;}
    public void check(String email){

        ArrayList<String>  emails = new ArrayList<>();
        emails.add("user@domain.co.in");
        emails.add("user@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        String regex  = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);


            Matcher matcher = pattern.matcher(email);
           // System.out.println(emai + ": " + matcher.matches() + "\n");
            System.out.println(email + ": " + matcher.matches() + "\n");

    }


}
