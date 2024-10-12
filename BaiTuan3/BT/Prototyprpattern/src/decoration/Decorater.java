package decoration;

public class Decorater extends Beverage{
  Beverage component;

  public Decorater(String description, Beverage component) {
    super(description);
    this.component = component;
  }

  @Override
  public int cost() {
    return component.cost();
  }

  @Override
  public String getDescription() {
    return component.getDescription() + " ," + this.description;
  }
}

