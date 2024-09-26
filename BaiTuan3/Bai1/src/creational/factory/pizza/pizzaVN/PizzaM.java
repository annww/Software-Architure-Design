package creational.factory.pizza.pizzaVN;

import creational.factory.pizza.Pizza;

public class PizzaM extends Pizza {

  @Override
  protected void prepare() {
    pizza.append("Prepare pizza M\n");

  }

  @Override
  protected void bake() {
    pizza.append("Bake pizza M\n");
  }

  @Override
  protected void cut() {
    pizza.append("Cut pizza M\n");
  }

  @Override
  protected void box() {
    pizza.append("Box this pizza M");
  }
}