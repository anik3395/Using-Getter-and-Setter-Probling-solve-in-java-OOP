package Inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height =0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    //Method Calling...
    public double getVolume(){
        return height * getArea();
    }

}
