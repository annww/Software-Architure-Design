package creational.prototype;

import java.util.Arrays;

public class MainClass {
  public static void main(String[] args) {
    SanPham sp1 = new SanPham("Mai","20000");
    SanPham sp2 = new SanPham("Dao", "30000");
    Order order = new Order("01","Ha", Arrays.asList(sp1,sp2));
    order.add(sp1);
    order.add(sp2);
    Order order1 = order.copy();
    Order order2 = order.clone();
    Order order3 = order;
    order.tenKH= "Min";
    order.sps.get(0).ten = "Lan";
    order.display();
    order1.display();
    order2.display();
    order3.display();
  }
}