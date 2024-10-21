package BaiTapTH.BuilderPatternA1;

public class HoaDonHeader {
  private String MaHD;
  private String ngayBan;
  private String tenKH;

  public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
    MaHD = maHD;
    this.ngayBan = ngayBan;
    this.tenKH = tenKH;
  }

  @Override
  public String toString() {
    return "HoaDonHeader{" +
        "MaHD='" + MaHD + '\'' +
        ", ngayBan='" + ngayBan + '\'' +
        ", tenKH='" + tenKH + '\'' +
        '}';
  }
}
