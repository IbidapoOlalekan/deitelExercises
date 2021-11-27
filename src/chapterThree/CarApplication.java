package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "2021", 14000);
        Car benz  = new Car("Mercedes","2020",10000000);

        System.out.printf("%s%n Year: %s%n Price: %.2f%n ",toyota.getModel(),toyota.getYear(),toyota.getPrice());
        System.out.printf("%s%n Year: %s%n Price: %.2f%n%n ",benz.getModel(),benz.getYear(),benz.getPrice());

        System.out.println("After five percent discount............");
        System.out.printf("%s%n Year: %s%n Price: %.2f%n ",toyota.getModel(),toyota.getYear(),toyota.getPrice()-(0.05 * toyota.getPrice()));

        System.out.println("After seven percent discount............");
        System.out.printf("%s%n Year: %s%n Price: %.2f%n ",benz.getModel(),benz.getYear(),benz.getPrice()-(0.07 * benz.getPrice()));

    }
}
