package BaiTapTH.BuilderPatternA1;

public class CTHD {
  private String SP;
  private int soLuong;
  private int Gia;

  public CTHD(String SP, int soLuong, int gia) {
    this.SP = SP;
    this.soLuong = soLuong;
    Gia = gia;
  }

  @Override
  public String toString() {
    return "CTHD{" +
        "SP='" + SP + '\'' +
        ", soLuong=" + soLuong +
        ", Gia=" + Gia +
        '}';
  }
}

