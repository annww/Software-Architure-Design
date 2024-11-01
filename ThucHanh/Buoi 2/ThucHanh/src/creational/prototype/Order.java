package creational.prototype;

import java.util.List;

public class Order extends Prototype{
  String id, tenKH;
  List<SanPham> sps;

  public Order(String id, String tenKH, List<SanPham> sps) {
    this.id = id;
    this.tenKH = tenKH;
    this.sps = sps;
  }

  public void display(){
    System.out.printf("Clone Order \n" + "ID: " + id + "\n" + "Ten khach hang: " + tenKH + "\n");
    for(SanPham sp: sps){
      System.out.printf(String.valueOf(sp));
    }
  }

  @Override
  public Order copy() {
    return (Order) super.copy();
  }


  @Override
  public Order clone() {
    return (Order) super.clone();
  }

  public void add(SanPham sp1) {
    
  }
}
