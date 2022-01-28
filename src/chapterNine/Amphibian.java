package chapterNine;

public class Amphibian extends Animal{
    public Amphibian(){
        super("Amphibian");
    }
    public void breath(String withWhat){
        System.out.println("I am breathing with " + withWhat);
    }
}
