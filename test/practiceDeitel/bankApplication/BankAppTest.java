package practiceDeitel.bankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAppTest {
    BankApp myAccount;
    @BeforeEach
    public void setUp() throws Exception {
        myAccount = new BankApp("Ibidapo Abdulazeez", "08124884392");
    }
    @Test
    public void accountCanBeCreatedTest(){

        myAccount.getAccountName();
        myAccount.getPhoneNumber();
        assertEquals("Ibidapo Abdulazeez",myAccount.getAccountName());
        assertEquals("08124884392",myAccount.getPhoneNumber());
    }

    @Test
    public void depositCanBeMadeTest(){
        myAccount.deposit(20000);
        assertEquals(20000,myAccount.getBalance());
    }
    @Test
    public void withdrawalCanBeMadeTest(){
        myAccount.deposit(20000);
        assertEquals(20000,myAccount.getBalance());
        myAccount.withdraw(10000);
        assertEquals(10000,myAccount.getBalance());
    }
   @Test
    public void depositAmountCannotBeNegative(){
        myAccount.deposit(-10000);
        assertEquals(0,myAccount.getBalance());
   }
   @Test
    public void withdrawalAmountCannotBeLessThanZero(){
        myAccount.deposit(10000);
        assertEquals(10000,myAccount.getBalance());
        myAccount.withdraw(-10000);
        assertEquals(10000,  myAccount.getBalance());
   }
   @Test
    public void paymentCanBeMade() throws Exception {
        myAccount.makePayment();
      assertEquals("Paid Successfully",myAccount.makePayment());

   }





}