public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void getArea(){
        System.out.println("The Area of rectengle is :" + height * width);
    }
}
