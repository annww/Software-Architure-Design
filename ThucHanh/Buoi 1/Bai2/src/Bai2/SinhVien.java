package Bai2;

import java.util.Date;

public class SinhVien {
  private String hoTen;
  private Date ngaySinh;
  private float Diem;

  public SinhVien(String hoTen, Date ngaySinh, float diem) {
    this.hoTen = hoTen;
    this.ngaySinh = ngaySinh;
    Diem = diem;
  }

  public String getHoTen() {
    return hoTen;
  }

  public Date getngaySinh(){
    return ngaySinh;
  }

  public float getdiemTB(){
    return Diem;
  }

  @Override
  public String toString() {
    return "SinhVien{" +
        "hoTen='" + hoTen + '\'' +
        ", ngaySinh=" + ngaySinh +
        ", Diem=" + Diem +
        '}';
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public Date getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(Date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public float getDiemTB() {
    return Diem;
  }

  public void setDiem(float diem) {
    Diem = diem;
  }


}

