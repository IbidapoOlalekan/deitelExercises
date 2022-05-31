package chapterSix;

public class CircleArea {

    public static double circleArea(double radius){
        if (radius < 0){
            return 0;
        }
        double area = Math.round(Math.PI * (radius * radius));

        return area;
    }
}
