package creational.sinhVien;

public class sinhVienBiz extends sinhVienNTU{

  private float diemMKT;
  private float diemSales;


  public sinhVienBiz(String hoTen, String nganh, float diemMKT, float diemSales) {
    super(hoTen, nganh);
    this.diemMKT = diemMKT;
    this.diemSales = diemSales;
  }

  @Override
  public float getDiemTB(){
    return (diemMKT *2 + diemSales)/3;
  }
}
