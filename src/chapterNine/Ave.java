package chapterNine;

public class Ave extends Animal{
    public Ave(String name){
        super(name);
    }
    @Override
    public void breath(){
        System.out.println("I am an Ave and I am breathing");
    }
    public void parentBreath(){
        super.breath();
    }
    public void move(){
        System.out.println("Moving like an Ave");
    }
}
