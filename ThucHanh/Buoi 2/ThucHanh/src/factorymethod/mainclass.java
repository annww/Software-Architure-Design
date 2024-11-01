package factorymethod;

public class mainclass {
  public static void main(String[] args) throws IllegalAccessException {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape rectangle = shapeFactory.createShape(ShapeType.rectangle);
    System.out.println(rectangle.draw());

    Shape circle = shapeFactory.createShape(ShapeType.circle);
    System.out.println(circle.draw());

    Shape triangle = shapeFactory.createShape(ShapeType.triangle);
    System.out.println(rectangle.draw());

    Shape anotherRectangle = shapeFactory.createShape(ShapeType.rectangle);
    System.out.println("Rectangle is Singleton: " + (rectangle == anotherRectangle));

    Shape anotherTriangle = shapeFactory.createShape(ShapeType.triangle);
    System.out.println("Triangle is Singleton: " + (triangle == anotherTriangle));

    Shape anotherCircle = shapeFactory.createShape(ShapeType.circle);
    System.out.println("Circle is Singleton: " + (circle == anotherCircle));
  }
}
