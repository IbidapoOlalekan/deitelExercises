package chapterSix;

public class Arithmetic {

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int add(int firstNumber, int secondNumber, int thirdNumber){
       // return add(add(firstNumber,secondNumber),thirdNumber);
//        int result = add(firstNumber,thirdNumber);
//        result = add(result,secondNumber);
//        return result;

        int result = add(add(firstNumber,thirdNumber),secondNumber);
        return result;
    }

    public double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
}
