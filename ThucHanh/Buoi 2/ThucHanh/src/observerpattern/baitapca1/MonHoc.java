package observerpattern.baitapca1;

public class MonHoc {
  private String ten;
  private int soTinChi;

  public MonHoc(String ten, int soTinChi) {
    this.ten = ten;
    this.soTinChi = soTinChi;
  }

  @Override
  public String toString() {
    return "MonHoc{" +
        "ten='" + ten + '\'' +
        ", soTinChi=" + soTinChi +
        '}';
  }
}
