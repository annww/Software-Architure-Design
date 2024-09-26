package creational.factory.pizza.pizzaVN;

import creational.factory.pizza.Pizza;

public class PizzaHaiSan extends Pizza {


  @Override
  protected void prepare() {
    pizza.append("Prepare Pizza Hai san\n");
  }

  @Override
  protected void bake() {
    pizza.append("Bake Pizza Hai san\n");
  }

  @Override
  protected void cut() {
    pizza.append("Cut Pizza Hai san\n");
  }

  @Override
  protected void box() {
    pizza.append("Make Pizza Hai san with box");
  }
}
