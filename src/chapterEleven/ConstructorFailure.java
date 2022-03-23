package chapterEleven;

public class ConstructorFailure {
    public ConstructorFailure(int userInput){
        if (userInput > 10) throw new IllegalArgumentException("Value Greater than Ten");
        else System.out.println("Valid Number");
    }

    public static void main(String[] args) {
        try{
            ConstructorFailure constructorFailure = new ConstructorFailure(4);
        }
        catch(IllegalArgumentException ex){
            System.out.println("Value Greater than Ten");
        }
    }
}
