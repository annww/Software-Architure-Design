package builderpattern.baitapa1;

public class CTHD {
  private String sanPham;
  private int soLuong;
  private double donGia;
  private double chietKhau;

  public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
    this.sanPham = sanPham;
    this.soLuong = soLuong;
    this.donGia = donGia;
    this.chietKhau = chietKhau;
  }

  public String getSanPham() {
    return sanPham;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public double getDonGia() {
    return donGia;
  }

  public double getChietKhau() {
    return chietKhau;
  }
}
