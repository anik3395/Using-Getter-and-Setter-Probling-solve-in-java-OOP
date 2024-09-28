package Inheritance;

public class Circle {
    private double radius;

    // Constructor of Circle class...
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            radius=0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Method Calling...
    public double getArea(){
        return (Math.PI * radius * radius);
    }
}
