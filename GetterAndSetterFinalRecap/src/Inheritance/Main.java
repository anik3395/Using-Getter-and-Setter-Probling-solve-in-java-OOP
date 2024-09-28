package Inheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        circle.setRadius(7.865);
        System.out.println(circle.getRadius());

        Cylinder cylinder =new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
