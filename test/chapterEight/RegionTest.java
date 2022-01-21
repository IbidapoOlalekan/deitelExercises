package chapterEight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chapterEight.Region.*;
import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegionTest {
    @Test
    public void regionTest(){

       Region region = NN;
       Region region2= EE;
        out.println(Arrays.toString(region.getState()));
    }
}
