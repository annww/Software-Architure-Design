package factorymethod;

public class ShapeFactory {
  public Shape createShape(ShapeType shapeType) throws IllegalAccessException {
    switch(shapeType){
      case triangle:
      return Triangle.getInstance();
      case rectangle:
        return Rectangle.getInstance();
      case circle:
        return Circle.getInstance();
      default:
        throw new IllegalAccessException("unknow shape type!");
    }
  }
}
