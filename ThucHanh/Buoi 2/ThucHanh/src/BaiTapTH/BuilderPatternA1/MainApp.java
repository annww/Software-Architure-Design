package BaiTapTH.BuilderPatternA1;

public class MainApp {
  public static void main(String[] args) {
    HoaDon hoaDon = new HoaDon.Builder()
        .setHeader("HD001", "20/10/2024", "Duong Thi Anh Hong")
        .addCTHD("Macbook", 1, 15000000)
        .addCTHD("Tui chong soc", 1, 500000)
        .build();

    System.out.printf(String.valueOf(hoaDon));
  }
}

