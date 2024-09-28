package Contructor;

public class Main {
    public static void main(String[] args) {
      WallArea wallArea = new WallArea();

      wallArea.setWidth(20);
      wallArea.setHeight(30);
      System.out.println(wallArea.getArea());

      WallArea wallArea1 =new WallArea();
      wallArea1.setHeight(-1.5);
      System.out.println(wallArea1.getArea());

    }
}
