package factorymethod;

public class Circle extends Shape{
  private static Circle instance;

  public Circle(String brush, String paper, String frame) {
    super(brush, paper, frame);
  }

  public static Circle getInstance(){
    if(instance == null){
      instance = new Circle("Brush for circle","Paper for circle","Frame for triangle");
    }
    return instance;
  }
  @Override
  public String draw() {
    return "Draw for circle " + brush + paper + frame;
  }


}
