package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sales Commission")
class SalesCommissionTest {

    SalesCommission salesCommission;
    @BeforeEach
    public void setUp(){
        int[] salary = {100,200,400,500};
        salesCommission =  new SalesCommission("YTZ",salary);
    }


    @DisplayName("Company Name Test")
    @Test void salesCommissionCompanyNameTest(){
        assertEquals("YTZ",salesCommission.getCompanyName());
    }

    @DisplayName("Company Name Can Be On The Table")
    @Test void salesCommissionCompanyNameCanBeOnTheTable(){
        salesCommission.displayMessage();
        assertEquals("Welcome to the sales commission for YTZ",salesCommission.displayMessage());
    }


}