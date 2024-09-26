package creational.factory.pizza;

import creational.factory.pizza.pizzaVN.PizzaM;

public class VN_PizzaFactory extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    switch (type){case M -> {return new PizzaM();}

    }
    return null;
  }
}

