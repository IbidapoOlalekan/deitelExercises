package chapterEight;

public class Beverage {
    private int cocoaQty;
    private int milkQty;
    private int sugarQty;

    public int getCocoaQty() {
        return cocoaQty;
    }

    public void setCocoaQty(int cocoaQty) {
        this.cocoaQty = cocoaQty;
    }

    public int getSugarQty() {
        return sugarQty;
    }

    public int getMilkQty() {
        return milkQty;
    }

    public void setMilkQty(int milkQty) {
        this.milkQty = milkQty;
    }

    public void setSugarQty(int sugarQty) {
        this.sugarQty = sugarQty;
    }

    public Beverage(){
    this.sugarQty = 5;
    }

    private Beverage(int cocoaQty, int milkQty, int sugarQty){
        this.cocoaQty = milkQty;
        this.sugarQty = sugarQty * 2;
        this.milkQty = cocoaQty;
    }


}
