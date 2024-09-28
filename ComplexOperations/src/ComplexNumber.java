public class ComplexNumber {

    private double real;
    private double imaginary;

    // Constructor.....
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter Method.....
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Public Method...
    public void add( double real , double imaginary){
        this.real += real;
        this.imaginary = imaginary + imaginary;
    }

    public void add (ComplexNumber other){
        add(other.real , other.imaginary);
    }

    public void subtract( double real ,double imaginary ){
        this.real -=real;
        this.imaginary -=imaginary;
    }
    public void subtract ( ComplexNumber other){
        subtract(other.real ,other.imaginary);
    }


}
