package practiceDeitel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcctsTest {

    @Test
    public void aNameCanBeTested(){
        Accts myAccount = new Accts();
         myAccount.setName("Bayo");
        assertEquals(myAccount.getName(),"Bayo");
    }
    @Test
    public void aDepositCanBeTested(){
        Accts myAccount = new Accts();
        double depositAmount = 100000;
        myAccount.deposit(depositAmount);
        assertEquals(myAccount.getBalance(),depositAmount);
    }
    @Test
    public void aDepositCannotBeZeroOrNegative(){
        Accts myAccount = new Accts();
        double depositAmount = -10000;
        myAccount.deposit(depositAmount);
        assertEquals(0,myAccount.getBalance());
    }
    @Test
    public void aDayCanBeTested(){
        Accts myAccount = new Accts();
        int day = 20;
        myAccount.setDay(day);
        assertEquals(20,day);
    }
    @Test
    public void aMonthCanBeTested(){
        Accts myAccount = new Accts();
        int month = 8;
        myAccount.setMonth(8);
        assertEquals(8,month);
    }

    @Test
    public void aYearCanBeTested(){
        Accts myAccount = new Accts();
        int year = 2012;
        myAccount.setYear(2012);
        assertEquals(year,2012);
    }

    @Test
    public void aWithdrawalCanBeTested(){
        Accts myAccount = new Accts();
        myAccount.deposit(20000);
        assertEquals(20000,myAccount.getBalance());
        double withdrawalAmount = 30000;
        myAccount.withdrawal(withdrawalAmount);
        assertEquals(withdrawalAmount,30000);
        assertEquals(20000,myAccount.getBalance());
    }

    @Test
    public void displayDateOfBirthCanBeTested(){
        Accts myAccount = new Accts();
        myAccount.displayDateOfBirth();
        myAccount.setDay(23);
        myAccount.setMonth(4);
        myAccount.setYear(2001);
        assertEquals(myAccount.getDay(),myAccount.getMonth(),myAccount.getYear(),myAccount.displayDateOfBirth());
    }
    @Test
    public void withdrawalCannotBeNegativeTest(){
        Accts myAccount = new Accts();
        myAccount.deposit(20000);
        double withdrawal =  -2000;

        myAccount.withdrawal(withdrawal);
        assertEquals(withdrawal,-2000);
        assertEquals(20000,myAccount.getBalance());
    }

}
