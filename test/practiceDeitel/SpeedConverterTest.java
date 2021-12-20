package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedConverterTest {
    @Test
    public void kilometersPerHourCanBeConvertedToMilesPerHour(){
        int kilometerPerHour = 200;
        long miles = SpeedConverter.toMilesPerHour(kilometerPerHour);
        assertEquals(124.0,miles);
    }
    @Test
    public void kilometersPerHourWouldReturnInvalidValueIfLessThanZero(){
        int kilometersPerHour = -1;
        long miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        assertEquals(-1,miles);
    }
    @Test
    public void printConversionDisplayInvalidValueIfKilometerPerHourIsNegative(){
        double kilometerPerHour = -2;
        SpeedConverter.printConversion(kilometerPerHour);
        assertEquals("Invalid Value",SpeedConverter.printConversion(kilometerPerHour));
    }
    @Test
    public void printConversionIsWorking(){
        double kilometerPerHour = 23;
        String mile  = SpeedConverter.printConversion(kilometerPerHour);
        assertEquals("23.0 Km/h = 14 mi/h ",mile);
    }
    @Test
    public  void displayIsWorking(){
        String message = "Working";
         SpeedConverter.display(message);
        System.out.println(message);

    }


}
