package factorymethod;

public class Rectangle extends Shape{
  private static Rectangle instance;

  public Rectangle(String brush, String paper, String frame) {
    super(brush, paper, frame);
  }

  public static Rectangle getInstance(){
    if(instance == null){
      instance = new Rectangle("Brush for rectangle","Paper for rectangle", "Frame for rectangle");
    }
    return instance;
  }

  @Override
  public String draw() {
    return "Drawing rectangle with " + brush + paper + frame;
  }
}
