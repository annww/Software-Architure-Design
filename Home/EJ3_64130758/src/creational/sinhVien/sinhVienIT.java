package creational.sinhVien;

public class sinhVienIT extends sinhVienNTU{
  private float diemJava;
  private float diemCss;
  private float diemHTML;

  public sinhVienIT(String hoTen, String nganh, float diemJava, float diemHTML, float diemCss) {
    super(hoTen, nganh);
    this.diemJava = diemJava;
    this.diemHTML = diemHTML;
    this.diemCss = diemCss;
  }

  @Override
  public float getDiemTB(){
    return (diemJava *2 + diemCss + diemHTML)/4;
  }
}
