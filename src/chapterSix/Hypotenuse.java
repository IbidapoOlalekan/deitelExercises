package chapterSix;

public class Hypotenuse {
    public static void main(String[] args) {
            double answer =  hypotenuse(3,4);
        System.out.println(answer);
    }
    public static double hypotenuse(double side1, double side2){
        double hypo = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        return hypo;
    }
}
