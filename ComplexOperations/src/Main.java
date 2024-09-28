public class Main {
    public static void main(String[] args) {
//         ComplexNumber one = new ComplexNumber(1,1);
//         System.out.println(one.getReal());
//         System.out.println(one.getImaginary());
//         one.subtract(2,8);

        ComplexNumber one = new ComplexNumber(1.0, 1.0);

//        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        one.subtract( 2.5, -1.5);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());




    }
}
