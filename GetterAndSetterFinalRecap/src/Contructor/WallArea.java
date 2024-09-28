package Contructor;

public class WallArea {
    private double width;
    private double height;

    public WallArea(){

    }

    public WallArea(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        if (width <0){
            this.width =0;
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height =0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Method Calling....
    public double getArea(){
        return width * height;
    }
}
