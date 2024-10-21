package BaiTapTH.SingletonA3;

enum ShapeType {
  RECTANGLE, TRIANGLE, CIRCLE
}
public abstract class Shape {
  protected String brush;
  protected String paper;
  protected String frame;

  public abstract String draw();
}
