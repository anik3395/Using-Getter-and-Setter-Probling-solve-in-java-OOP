public class Main {

    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.height=1.2;
        shape.width=2.5;
        shape.getArea();

        System.out.println();

        Rectangle rectangle =new Rectangle(1.5, 3.5);
        rectangle.getArea();

    }
}
