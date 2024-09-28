package Inhreitance1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("The rectangle area : "+rectangle.getArea());

        Cuboid cuboid =new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.Volume= " + cuboid.getVolume());
    }
}
