public class SumCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    //Method Calling...
    public int getAdditionResult(){
        int adding = (int) (firstNumber + secondNumber);
        return adding;
    }
    public int  getSubtractionResult(){
        int subtracting = (int) (firstNumber - secondNumber);
        return subtracting;
    }

    public int getMultiplicationResult(){
        int multiplying = (int) (firstNumber * secondNumber);
        return multiplying;
    }

    public int getDivisionResult (){
        int dividing = (int) (firstNumber / secondNumber);
        return dividing;
    }




}
