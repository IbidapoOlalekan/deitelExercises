package practiceDeitel;

public class CarMain {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car ferrari = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel() );
    }


}
