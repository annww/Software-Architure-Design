package creational.sinhVien;

public class sinhVienNTU {
  private String hoTen;
  private String nganh;

  // constructor

  public sinhVienNTU(String hoTen, String nganh) {
    this.hoTen = hoTen;
    this.nganh = nganh;
  }

  public float getDiemTB(){
    return 0;
  }

  public String getHocLuc(){
    float diemTB = getDiemTB();
    if(diemTB < 0){
      return "Chua co diem tb";
    }
    if(diemTB < 5.0){
      return "Yếu";
    }
    else if(diemTB < 6.5){
      return "Trung bình";
    }
    else if(diemTB < 8.0){
      return "Khá";
    }
    else return "Giỏi";
  }

  void inThongTin(){
    System.out.printf("Ho ten:" + hoTen + "\n" + "Nganh hoc: " + nganh + "\n" + "Hoc luc: " + getHocLuc() + "\n");
  }
}
