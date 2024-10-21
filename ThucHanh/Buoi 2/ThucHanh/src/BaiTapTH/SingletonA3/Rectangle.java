package BaiTapTH.SingletonA3;

public class Rectangle extends Shape{
  private static Rectangle instance;

  private Rectangle() {
    this.brush = "Rectangle Brush";
    this.paper = "Rectangle Paper";
    this.frame = "Rectangle Frame";
  }

  public static Rectangle getInstance() {
    if (instance == null) {
      instance = new Rectangle();
    }
    return instance;
  }

  @Override
  public String draw() {
    return "Drawing Rectangle with " + brush + ", " + paper + ", " + frame;
  }
}
