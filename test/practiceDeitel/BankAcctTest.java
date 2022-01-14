package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAcctTest {
    BankAcct bankAcct = new BankAcct();
    @Test
    public void accountNumberCanBeGivenToAUser(){
        String accountNumber = "0254836708";
        bankAcct.setAccountNumber(accountNumber);
        assertEquals("0254836708",bankAcct.getAccountNumber());
    }
    @Test
    public void wrongAccountNumberWouldNotBeAccepted(){
        String accountNumber = "02548367";
        bankAcct.setAccountNumber(accountNumber);
        assertEquals(null,bankAcct.getAccountNumber());
    }

    @Test
    public void accountNameCanBeAssignedToACustomer(){
        String accountName = "Ibidapo Abdulazeez";
        bankAcct.setCustomerName(accountName);
        assertEquals(accountName,bankAcct.getCustomerName());
    }
    @Test
    public void accountEmailCanBeRegistered(){
        String accountEmail = "ibidapoazeez @ gmail.com";
        bankAcct.setEmail(accountEmail);
        assertEquals(accountEmail,bankAcct.getEmail());
    }

    @Test
    public void accountEmailCaseInLowerCase(){
        String accountEmail = "ibidapoazeez @ gmail.com";
        accountEmail = accountEmail.toUpperCase();
        assertEquals(accountEmail,"IBIDAPOAZEEZ @ GMAIL.COM");
        bankAcct.setEmail(accountEmail);
        assertEquals(accountEmail,bankAcct.getEmail());
    }

    @Test
    public void accountCanBeAttachedToAPhoneNumber(){
        String phoneNumber = "8054262600";
        bankAcct.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber,bankAcct.getPhoneNumber());
    }
    @Test
    public void invalidPhoneNumber(){
        String phoneNumber = "12334444";
        bankAcct.setPhoneNumber(phoneNumber);
        assertEquals(null,bankAcct.getPhoneNumber());
    }
}
