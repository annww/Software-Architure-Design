package BaiTapTH.SingletonA6;

public class SanPham {
  String MaSP;
  String tenSP;
  int gia;
  int soluong;

  public SanPham(String maSP, String tenSP, int gia, int soluong) {
    MaSP = maSP;
    this.tenSP = tenSP;
    this.gia = gia;
    this.soluong = soluong;
  }

  @Override
  public String toString() {
    return "SanPham{" +
        "MaSP='" + MaSP + '\'' +
        ", tenSP='" + tenSP + '\'' +
        ", gia=" + gia +
        ", soluong=" + soluong +
        '}';
  }
}
