package creational.factory.pizza;

public abstract class Pizza
{
  protected StringBuilder pizza = new StringBuilder();
  protected abstract void prepare();
  protected abstract void bake();
  protected abstract void cut();
  protected abstract void box();

  @Override
  public String toString() {
  return pizza.toString();
}
}



