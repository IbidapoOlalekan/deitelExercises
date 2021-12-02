package bankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private MyAccount lekanAccount = new MyAccount("Ibidapo Olalekan","1234");
    @Test
    public void accountCanBeCreatedTest(){

        String name =  lekanAccount.getAccountName();
        assertEquals("Ibidapo Olalekan",name);
    }

    @Test
    public void checkIfBalanceIs50KTest(){

        int balance = lekanAccount.getBalance("1234");
        assertEquals(50_000,balance);
    }
    @Test
    public void checkDeposit(){
        lekanAccount.deposit(10000);
       int balance = lekanAccount.getBalance("1234");
        assertEquals(60000,balance);

    }

    @Test
    public void checkIfDepositIsNegative(){

        lekanAccount.deposit(-10000);
        int balance = lekanAccount.getBalance("1234");
        assertEquals(50_000,balance);
    }


}
