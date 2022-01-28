package chapterNine;

public class Ave extends Animal{
    public Ave(){
        super("Aves");
    }
    @Override
    public void breath(){
        System.out.println("I am an Ave and I am breathing");
    }
    public void parentBreath(){
        super.breath();
    }
}
