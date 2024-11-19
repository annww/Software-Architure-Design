package OnThi.builder;

public class SinhVien {
  private String maSV;
  private String hotenSV;
  private String ngaySinh;
  private String queQuan;

  public SinhVien(String maSV, String hotenSV, String ngaySinh, String queQuan) {
    this.maSV = maSV;
    this.hotenSV = hotenSV;
    this.ngaySinh = ngaySinh;
    this.queQuan = queQuan;
  }

  @Override
  public String toString() {
    return "SinhVien{" +
        "maSV='" + maSV + '\'' +
        ", hotenSV='" + hotenSV + '\'' +
        ", ngaySinh='" + ngaySinh + '\'' +
        ", queQuan='" + queQuan + '\'' +
        '}';
  }
}
