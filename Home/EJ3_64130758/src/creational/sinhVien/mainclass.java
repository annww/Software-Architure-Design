package creational.sinhVien;

public class mainclass {
  public static void main(String[] args) {

    // Khoi tao sv

    sinhVienNTU sv1 = new sinhVienNTU("Duong A", "CNTT");
    sinhVienIT sv2 = new sinhVienIT("Vi An", "CNTT", 10f,5f,7.5f);
    sinhVienBiz sv3 = new sinhVienBiz("Hoang Sam", "Kinh Te", 8.5f, 6.7f);

    // In thong tin sv
    sv1.inThongTin();
    sv2.inThongTin();
    sv3.inThongTin();
  }
}
