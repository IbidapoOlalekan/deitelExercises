package chapterSix;

public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius = Celsius(23);
        System.out.println(celsius);

       double fahrenheit = fahrenheit(-5);
        System.out.println(fahrenheit);
    }


    public static double Celsius(double fahrenheit){
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    public static double fahrenheit(double celsius){
        double fahrenheit = 9.0/5.0 * celsius +32;
        return fahrenheit;

    }
}

