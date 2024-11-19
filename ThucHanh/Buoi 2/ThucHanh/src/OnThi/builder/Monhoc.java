package OnThi.builder;

public class Monhoc {
  private String maMH;
  private String tenMH;
  private int soTC;

  public Monhoc(String maMH, String tenMH, int soTC) {
    this.maMH = maMH;
    this.tenMH = tenMH;
    this.soTC = soTC;
  }

  @Override
  public String toString() {
    return "Mã: " + maMH + ", Tên: " + tenMH + ", Số tín chỉ: " + soTC;
  }
}
