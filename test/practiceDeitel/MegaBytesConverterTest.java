package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MegaBytesConverterTest {
    @Test
    public void printMegaBytesAndKiloBytes(){
        MegaBytesConverter.printMegaBytesAndKiloBytes(4000);

    }

    @Test
    public void kiloBytesCannotBeNegative(){
        MegaBytesConverter.printMegaBytesAndKiloBytes(-200);
    }

}
