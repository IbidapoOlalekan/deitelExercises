package practiceDeitel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AcctsTest {

    @Test
    public void aNameCanBeTested(){
        Accts myAccount = new Accts();
         myAccount.setName("Bayo");
        Assertions.assertEquals(myAccount.getName(),"Bayo");
    }
    @Test
    public void aDepositCanBeTested(){
        Accts myAccount = new Accts();
        double depositAmount = 100000;
        myAccount.deposit(depositAmount);
        Assertions.assertEquals(myAccount.getBalance(),depositAmount);
    }
    @Test
    public void aDayCanBeTested(){
        Accts myAccount = new Accts();
        int day = 20;
        myAccount.setDay(day);
        Assertions.assertEquals(20,day);
    }
    @Test
    public void aMonthCanBeTested(){
        Accts myAccount = new Accts();
        int month = 8;
        myAccount.setMonth(8);
        Assertions.assertEquals(8,month);
    }

    @Test
    public void aYearCanBeTested(){
        Accts myAccount = new Accts();
        int year = 2012;
        myAccount.setYear(2012);
        Assertions.assertEquals(year,2012);
    }

    @Test
    public void aWithdrawalCanBeTested(){
        Accts myAccount = new Accts();
        double withdrawalAmount = 20000;
        myAccount.withdrawal(withdrawalAmount);
        Assertions.assertEquals(withdrawalAmount,20000);
    }
    @Test
    public void displayDateOfBirthCanBeTested(){
        Accts myAccount = new Accts();
        myAccount.displayDateOfBirth();
        myAccount.setDay(23);
        myAccount.setMonth(4);
        myAccount.setYear(2001);
        Assertions.assertEquals(myAccount.getDay(),myAccount.getMonth(),myAccount.getYear(),myAccount.displayDateOfBirth());
    }

}
