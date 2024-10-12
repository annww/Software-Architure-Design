package decoration;

public class MainBeverage {
  public static void main(String[] args) {
    Beverage b = new HouseBlend("Cafe");
    b = new Milk("Ong tho ", b);
    System.out.printf(b.getDescription());
    System.out.printf(String.valueOf(b.cost()) + "\n");
    b = new Milk("Sua xe dap ", b);
    System.out.printf(b.getDescription());
    System.out.printf(String.valueOf(b.cost()));
  }
}
