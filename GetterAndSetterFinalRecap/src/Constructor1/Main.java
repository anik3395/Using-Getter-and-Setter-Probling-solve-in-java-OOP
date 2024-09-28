package Constructor1;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        point.setX(6);
        point.setY(5);
        System.out.println(point.distance());

        point.setX(10);
        point.setY(8);
        System.out.println(point.distance());

    }
}
