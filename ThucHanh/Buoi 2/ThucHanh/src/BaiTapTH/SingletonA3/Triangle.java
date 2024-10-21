package BaiTapTH.SingletonA3;

public class Triangle extends Shape{
  private static Triangle instance;

  private Triangle(){
    this.brush = "Triangle brush";
    this.paper = "Triangle paper";
    this.frame = "Triangle frame";
  }

  public static Triangle getInstance(){
    if (instance == null){
      instance = new Triangle();
    }
    return instance;
  }

  @Override
  public String draw() {
    return "Drawing Triangle with " + brush + ", " + paper + ", " + frame;
  }
}
