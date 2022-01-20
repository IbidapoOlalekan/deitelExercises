package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAcctTest {
    BankAcct bankAcct = new BankAcct();
    @Test
    public void accountCanBeCreatedWithCustomerAndPhoneNumberTest(){
        BankAcct judithAccount = new BankAcct("Judith","08032456799");
        assertEquals("Judith",judithAccount.getCustomerName());
        assertEquals("08032456799",judithAccount.getPhoneNumber());
        judithAccount.toString();

    }

    @Test
    public void accountCanBeCreatedWithAllRequiredFieldsTest(){
        BankAcct jacinthAccount = new BankAcct("Jacintha","08052344500","0254736456");
        assertEquals("Jacintha", jacinthAccount.getCustomerName());
        assertEquals("08052344500", jacinthAccount.getPhoneNumber());
        assertEquals("0254736456",jacinthAccount.getAccountNumber());
    }
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
    public void aWrongEmailCannotBeUsedToRegisterAnAccountTest(){
        String accountEmail  = "@gmail.com";
        bankAcct.setEmail(accountEmail);
        assertEquals(accountEmail,bankAcct.getEmail());
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

    @Test
    public void depositCanBeMade(){
        double depositAmount= 20000;
        bankAcct.deposit(depositAmount);
        assertEquals(bankAcct.getBalance(),depositAmount);
    }
    @Test
    public void zeroOrNegativeAmountCannotBeDeposited(){
        double depositAmount = -1000;
        bankAcct.deposit(depositAmount);
        assertEquals(bankAcct.getBalance(),0);
    }

    @Test
    public void withdrawalCanBeMade(){
        double depositAmount = 10000;
        bankAcct.deposit(depositAmount);
        assertEquals(bankAcct.getBalance(),depositAmount);
        double withdrawalAmount = 1000;
        bankAcct.withdrawal(withdrawalAmount);
        assertEquals(bankAcct.getBalance(),9000);
    }

    @Test
    public void withdrawalCannotBeMadeIfWithdrawalAmountExceedAccountBalance(){
        double depositAmount = 100000;
        bankAcct.deposit(depositAmount);
        assertEquals(bankAcct.getBalance(),depositAmount);
        double withdrawalAmount = 1000000;
        bankAcct.withdrawal(withdrawalAmount);
        assertEquals(depositAmount,bankAcct.getBalance());
    }
    @Test
    public void withdrawalAmountCannotBeLessThanZero(){
        double depositAmount = 1000;
        bankAcct.deposit(depositAmount);
        assertEquals(bankAcct.getBalance(),depositAmount);
        double withdrawalAmount = -10;
        bankAcct.withdrawal(withdrawalAmount);
        assertEquals(depositAmount,bankAcct.getBalance());
    }


}
