package practiceDeitel.animal;

public class Fish extends Animal implements Swim{
    private int size;
    private boolean canEat;
    private boolean canSwim;

    public String swim(){
        canSwim = true;
        return "Im swimming like a Fish";
    }

    public boolean getCanSwim(){
        return canSwim;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat() {
        canEat = true;
    }
}
