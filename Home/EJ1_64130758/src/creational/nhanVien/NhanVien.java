package creational.nhanVien;

public class NhanVien {
  private String ten;
  private int tuoi;
  private String diachi;
  private double luong;
  private int tonggiolam;

  // Constructor khong tham so
  public NhanVien() {
  }

  // Constructor day thu tham so
  public NhanVien(String ten, int tuoi, String diachi, double luong, int tonggiolam) {
    this.ten = ten;
    this.tuoi = tuoi;
    this.diachi = diachi;
    this.luong = luong;
    this.tonggiolam = tonggiolam;
  }

  // Ham get/set

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public String getDiachi() {
    return diachi;
  }

  public void setDiachi(String diachi) {
    this.diachi = diachi;
  }

  public double getLuong() {
    return luong;
  }

  public void setLuong(double luong) {
    this.luong = luong;
  }

  public int getTonggiolam() {
    return tonggiolam;
  }

  public void setTonggiolam(int tonggiolam) {
    this.tonggiolam = tonggiolam;
  }

  // toString()

  @Override
  public String toString() {
    return "NhanVien{" +
        "ten='" + ten + '\'' +
        ", tuoi=" + tuoi +
        ", diachi='" + diachi + '\'' +
        ", luong=" + luong +
        ", tonggiolam=" + tonggiolam +
        '}';
  }

  // phuong thuc tinhThuong
  public double tinhThuong(){
    if(tonggiolam > 200){
      return luong*0.2;
    }
    else if(tonggiolam<200 && tonggiolam >= 100){
      return luong*0.1;
    }
    else{
      return 0;
    }
  }

  //interface QLNV
  interface IQuanLy{
    void themNhanVien(NhanVien nv);
    void inDS();
  }
}
