package chapterTen;

public class Human extends ClassAB implements Moveable,Flyable {
    public void read(){
        System.out.println("I can read");
    }

    @Override
    public void move() {
        System.out.println("Moving like a Human");
    }

    @Override
    public void fly() {
        System.out.println("I am going higher yes i am.......");
    }

    @Override
    public void wake() {
        System.out.println("I no wan wake");
    }
}
