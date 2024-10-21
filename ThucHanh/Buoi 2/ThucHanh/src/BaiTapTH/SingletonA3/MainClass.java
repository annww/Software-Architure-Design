package BaiTapTH.SingletonA3;

public class MainClass {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
    System.out.println(rectangle.draw());
    Shape triangle = shapeFactory.createShape(ShapeType.TRIANGLE);
    System.out.println(triangle.draw());
    Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
    System.out.println(circle.draw());
  }
}
