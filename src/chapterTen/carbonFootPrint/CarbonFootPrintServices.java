package chapterTen.carbonFootPrint;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class CarbonFootPrintServices {
    public String toCommaNumber(double number) {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat();
        df.setDecimalFormatSymbols(dfs);
        return df.format(number);
    }
}
