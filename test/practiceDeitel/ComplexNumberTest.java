package practiceDeitel;

import org.junit.jupiter.api.Test;
import practiceDeitel.ComplexNumberCode.ComplexNumber;

public class ComplexNumberTest {
    @Test

    public void firstTest(){
        ComplexNumber complexNumber = new ComplexNumber(2,4);
        complexNumber.add(2,4);
    }
}
