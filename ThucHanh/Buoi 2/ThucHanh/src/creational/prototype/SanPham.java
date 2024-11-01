package creational.prototype;

public class SanPham extends Prototype{
  String ten;
  int gia;

  public SanPham(String ten, String gia) {
    this.ten = ten;
    this.gia = Integer.parseInt(gia);
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getGia() {
    return gia;
  }

  public void setGia(String gia) {
    this.gia = Integer.parseInt(gia);
  }

  @Override
  public String toString() {
    return "SanPham{" +
        "ten='" + ten + '\'' +
        ", gia='" + gia + '\'' +
        '}' + "\n";
  }

}
