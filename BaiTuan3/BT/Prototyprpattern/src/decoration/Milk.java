package decoration;

public class Milk extends Decorater{
  public Milk(String description, Beverage component) {
    super(description, component);
  }

  @Override
  public int cost() {
    return super.cost() + 5;
  }
}
