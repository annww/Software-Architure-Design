package builderpattern.baitapa1;

public class hoaDonHeader {
  private String maHoaDon;
  private String ngayBan;
  private String tenKH;

  public hoaDonHeader(String maHoaDon, String ngayBan, String tenKH) {
    this.maHoaDon = maHoaDon;
    this.ngayBan = ngayBan;
    this.tenKH = tenKH;
  }

  public String getMaHoaDon() {
    return maHoaDon;
  }

  public String getNgayBan() {
    return ngayBan;
  }

  public String getTenKH() {
    return tenKH;
  }
}
