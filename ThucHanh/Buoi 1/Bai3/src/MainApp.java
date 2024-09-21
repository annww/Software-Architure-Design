public class MainApp {
  public static void main(String[] args) {
    SinhVienNTU sv1 = new SinhVienNTU("Anh Hong", "CNTT") {
      @Override
      public float getDiemTB() {
        return 7.5F;
      }
    };

    SinhVienBiz sv2 = new SinhVienBiz("Vi An", "CNTP", 8,7);

    SinhVienIT sv3 = new SinhVienIT("Minh", "NNA", 5, 9, 5.6f);

    // In thong tin sinh vien
    sv1.inThongTin();
    System.out.println();
    sv2.inThongTin();
    System.out.println();
    sv3.inThongTin();
    System.out.println();
  }
}
