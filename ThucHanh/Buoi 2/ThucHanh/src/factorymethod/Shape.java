package factorymethod;

public abstract class Shape {
  public String brush;
  public String paper;
  public String frame;

  public Shape(String brush, String paper, String frame) {
    this.brush = brush;
    this.paper = paper;
    this.frame = frame;
  }

  public abstract String draw();
}
