package practiceDeitel.bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAppTest {
    @Test
    public void accountCanBeCreatedTest(){
        String accountName = "Ibidapo Abdulazeez";
        String phoneNumber = "08054262600";
        BankApp newAccount = new BankApp(accountName,phoneNumber);
        newAccount.getAccountName();
        newAccount.getPhoneNumber();
        assertEquals(accountName,newAccount.getAccountName());
        assertEquals(phoneNumber,newAccount.getPhoneNumber());
    }

    @Test
    public void depositCanBeMadeTest(){
        BankApp myAccount = new BankApp("Ibidapo Abdulazeez","08054262600");
        myAccount.deposit(20000);
        assertEquals(20000,myAccount.getBalance());
    }
    @Test
    public void withdrawalCanBeMadeTest(){
        BankApp newAccount = new BankApp("Ibidapo Abdulazeez","08054262600");
        newAccount.deposit(20000);
        assertEquals(20000,newAccount.getBalance());
        newAccount.withdraw(10000);
        assertEquals(10000,newAccount.getBalance());
    }
   @Test
    public void depositAmountCannotBeNegative(){
        BankApp newAccount = new BankApp("Ibidapo Abdulazeez","08054262600");
        newAccount.deposit(-10000);
        assertEquals(0,newAccount.getBalance());
   }
   @Test
    public void withdrawalAmountCannotBeLessThanZero(){
        BankApp newAccount =new  BankApp("Ibidapo Abdulazeez","08054262600");
        newAccount.deposit(10000);
        assertEquals(10000,newAccount.getBalance());
        newAccount.withdraw(-10000);
        assertEquals(10000,  newAccount.getBalance());
   }





}