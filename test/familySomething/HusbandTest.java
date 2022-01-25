package familySomething;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HusbandTest {
    @Test
    public void iyawoSnatchingTest(){
        Wife peterWife = new Wife();
        Husband peter = new Husband(peterWife);
        peter.askWifeToCook("Poundo And Egusi With Ogunfe");

    }

}