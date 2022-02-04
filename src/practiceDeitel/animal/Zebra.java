package practiceDeitel.animal;

public class Zebra extends Animal{

    private boolean isWild;

    public boolean isWild() {
        return isWild;
    }


    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String run() {
        return "Running Like A Zebra";
    }
}
