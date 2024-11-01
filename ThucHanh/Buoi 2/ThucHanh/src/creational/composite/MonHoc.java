package creational.composite;

public class MonHoc extends KeHoachHT {
  int soTC, hocPhi;

  public MonHoc(int soTC, int hocPhi) {
    this.soTC = soTC;
    this.hocPhi = hocPhi;
  }

  public int getSoTC() {
    return soTC;
  }

  public void setSoTC(int soTC) {
    this.soTC = soTC;
  }

  public int getHocPhi() {
    return hocPhi*soTC;
  }

  public void setHocPhi(int hocPhi) {
    this.hocPhi = hocPhi;
  }

  @Override
  public String toString() {
    return "MonHoc{" +
        "soTC=" + soTC +
        ", hocPhi=" + hocPhi +
        '}';
  }

  @Override
  public void add(KeHoachHT k) {
    throw new UnsupportedOperationException("Không thể thêm môn học");
  }

  @Override
  public void remove(KeHoachHT k) {
    throw new UnsupportedOperationException("Không thể xóa khỏi kể hoạch học tập");
  }

  @Override
  public int getsoTC() {
    return soTC ;
  }

  @Override
  public int gethocPhi() {
    return hocPhi;
  }

  @Override
  public String thongTin() {
    return "Số tín chỉ " + soTC + " học phí " + hocPhi;
  }
}
