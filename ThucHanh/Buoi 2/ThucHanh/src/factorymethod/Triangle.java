package factorymethod;

public class Triangle extends Shape{
  private static Triangle instance;

  public Triangle(String brush, String paper, String frame) {
    super(brush, paper, frame);
  }

  public static Triangle getInstance(){
    if(instance == null){
      instance = new Triangle("Brush for triangle", "Paper for triangle", "Frame for triangle");
    }
    return instance;
  }

  @Override
  public String draw() {
    return "Draw for triangle" + brush + paper + frame;
  }
}
