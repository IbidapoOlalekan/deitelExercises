package practiceDeitel;

public class SumCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;

    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;

    }

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        double sum = firstNumber + secondNumber;
        return sum;
    }
    public double getSubtractionResult(){
        double difference = firstNumber - secondNumber;
        return difference;
    }
    public double getMultiplicationResult(){
        double product = firstNumber * secondNumber;
        return product;
    }

    public double getDivisionResult(){
     if (secondNumber == 0){
         return 0;
     }
     else {
         double division = firstNumber/ secondNumber;
         return division;
     }

    }

}
