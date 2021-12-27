package chapterSix;

public class Minimum {
    public static float minimum3(float num1, float num2, float num3){
      float min =  Math.min(Math.min(num2,num3),num1);
       return min;
    }
}
