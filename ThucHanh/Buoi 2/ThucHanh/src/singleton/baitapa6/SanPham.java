package singleton.baitapa6;

public class SanPham {
  public String maSP;
  public String tenSP;
  public String soLuong;
  public String donGia;

  public SanPham(String maSP, String tenSP, String soLuong, String donGia) {
    this.maSP = maSP;
    this.tenSP = tenSP;
    this.soLuong = soLuong;
    this.donGia = donGia;
  }

  public String getMaSP() {
    return maSP;
  }

  public void setMaSP(String maSP) {
    this.maSP = maSP;
  }

  public String getTenSP() {
    return tenSP;
  }

  public void setTenSP(String tenSP) {
    this.tenSP = tenSP;
  }

  public String getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(String soLuong) {
    this.soLuong = soLuong;
  }

  public String getDonGia() {
    return donGia;
  }

  public void setDonGia(String donGia) {
    this.donGia = donGia;
  }
}
