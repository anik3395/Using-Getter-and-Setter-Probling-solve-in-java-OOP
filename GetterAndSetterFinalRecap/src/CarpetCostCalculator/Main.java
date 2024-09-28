package CarpetCostCalculator;

public class Main {
    public static void main(String[] args) {
        Floor floor=new Floor(2.75, 4.0);
        Carpet carpet=new Carpet(3.5);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());

        Floor floor1 = new Floor(5.4, 4.5);
        Carpet carpet1 =new Carpet(1.5);
        Calculator calculator1 = new Calculator(floor1,carpet1);
        System.out.println(calculator1.getTotalCost());

    }
}
