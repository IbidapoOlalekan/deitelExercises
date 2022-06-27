package chapterTen;

public class Dog extends ClassB implements Moveable{
    public void canNotRead(){
        System.out.println("Clearly");
    }

    @Override
    public void move() {
        System.out.println("Dog walk");
    }
}
