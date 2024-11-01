package behavioral.observerpattern.baiCA5;

public class MainATM {
  public static void main(String[] args) {
    ATM atm = new ATM();
    TaiKhoanATM t1 = new TaiKhoan(1000,"Vi An", atm);
    TaiKhoanATM t2 = new TaiKhoan(2000, "Hong", atm);
    ((TaiKhoan) t1).duaTheVaoATM();
    atm.rutTien(300);
    ((TaiKhoan) t1).rutThe();
  }
}
