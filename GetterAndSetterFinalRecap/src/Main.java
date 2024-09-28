public class Main {
    public static void main(String[] args) {
      SumCalculator sumCalculator = new SumCalculator();

      sumCalculator.setFirstNumber(20);
      sumCalculator.setSecondNumber(5);

        System.out.println(sumCalculator.getMultiplicationResult());
        System.out.println(sumCalculator.getAdditionResult());
        System.out.println(sumCalculator.getSubtractionResult());
        System.out.println(sumCalculator.getDivisionResult());


    }
}
