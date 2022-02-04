package practiceDeitel.animal;

public class Duck extends Animal implements Swim{
    private final String beakColour ="yellow";

    public String getBeakColor() {
        return beakColour;
    }

    public String swim() {
        return "I am swimming like a Duck";
    }

    public void quack() {
    }

}
