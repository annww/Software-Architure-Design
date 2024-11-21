package observerpattern.baitapca6;

public class PlayerData {
  private int thoiGian;
  private int soLuong;
  private int diem;
  PlayerData_listener listeners;

  public PlayerData(int thoiGian, int soLuong, int diem) {
    this.thoiGian = thoiGian;
    this.soLuong = soLuong;
    this.diem = diem;
  }

  public int getThoiGian() {
    return thoiGian;
  }

  public void setThoiGian(int thoiGian) {
    this.thoiGian = thoiGian;
    listeners.listener(this);
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
    listeners.listener(this);
  }

  public int getDiem() {
    return diem;
  }

  public void setDiem(int diem) {
    this.diem = diem;
    listeners.listener(this);
  }

  public PlayerData_listener getListeners() {
    return listeners;
  }

  public void dangKy(PlayerData_listener listeners){
    this.listeners = listeners;
    listeners.listener(this);
  }

  public void huyDangKy(PlayerData_listener listeners){
    this.listeners = null;
    System.out.println("Hủy đăng ký thông báo thành công!!");;
  }
}
