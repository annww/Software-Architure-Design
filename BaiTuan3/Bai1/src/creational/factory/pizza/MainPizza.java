package creational.factory.pizza;

public class MainPizza {
  public static void main(String[] args) {
    PizzaStore store = new VN_PizzaFactory();
    Pizza p = store.orderPizza(PizzaType.M);
    System.out.println(p.toString());
  }
}
