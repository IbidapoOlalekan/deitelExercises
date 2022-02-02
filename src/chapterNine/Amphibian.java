package chapterNine;

public class Amphibian extends Animal{
    public Amphibian(String name){
        super(name);
    }
    public void breath(String withWhat){
        System.out.println("I am breathing with " + withWhat);
    }
    public void move(){
        System.out.println("Moving like an Amphibian");
    }
}
