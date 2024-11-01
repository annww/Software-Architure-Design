package creational.decoratpattern.baitapb1;

public class MainClass {
  public static void main(String[] args) {
    BieuThuc bieuThuc = new BieuThucDonGian(10);
    bieuThuc = new Cong(bieuThuc,5);
    bieuThuc = new Tru(bieuThuc,2);
    bieuThuc = new Nhan(bieuThuc,4);
    bieuThuc = new Chia(bieuThuc,3);

    System.out.println("Biểu thức: " + bieuThuc.bieuThuc());
    System.out.println("Giá trị: " + bieuThuc.giaTri());
  }
}
