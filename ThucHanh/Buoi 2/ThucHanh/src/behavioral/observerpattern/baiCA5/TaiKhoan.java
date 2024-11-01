package behavioral.observerpattern.baiCA5;

import java.awt.color.ICC_ColorSpace;

public class TaiKhoan implements TaiKhoanATM {
  int soDu;
  String tenTK;
  ATM atm;

  public TaiKhoan(int soDu, String tenTK, ATM atm) {
    this.soDu = soDu;
    this.tenTK = tenTK;
    this.atm = atm;
  }

  public void duaTheVaoATM(){
    atm.nhanThe(this);
  }

  public void rutThe(){
    atm.traThe();
    System.out.println("Da rut the!");
  }

  @Override
  public boolean kiemTraSoDu(int soTien) {
    return soDu-soTien >= 50;
  }

  @Override
  public void nhanThongBao(int soTienRut, boolean thanhCong) {
    if(thanhCong){
      System.out.println("Ban dang rut tien");
      System.out.println("So du ban dau: " + soDu);
      System.out.println("So tien rut: " + soTienRut);
      int soDuConLai = soDu - soTienRut;
      System.out.println("So du con lai: " + soDuConLai);
    }
    else{
      System.out.println("Ban dang rut tien");
      System.out.println("So du ban dau: " + soDu);
      System.out.println("So tien rut: " + soTienRut);
      System.out.println("Ban dang khong du tien rut");
    }
  }
}
