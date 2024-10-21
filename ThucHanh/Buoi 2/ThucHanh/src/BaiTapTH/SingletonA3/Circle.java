package BaiTapTH.SingletonA3;

public class Circle extends Shape{
  private static Circle instance;

  private Circle() {
    this.brush = "Circle brush";
    this.paper = "Circle paper";
    this.frame = "Circle frame";
  }

  public static Circle getInstance(){
    if (instance == null) {
      instance = new Circle();
    }
    return instance;
  }

  @Override
  public String draw() {
    return "Drawing Circle with " + brush + ", " + paper + ", " + frame;
  }
}
