package creational.nhanVien;
import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements NhanVien.IQuanLy {

  private List<NhanVien> danhsachnhanvien;

  public QuanLyNhanVien(){danhsachnhanvien = new ArrayList<>();}

  @Override
  public void themNhanVien(NhanVien nv){danhsachnhanvien.add(nv);}

  @Override
  public void inDS() {
    for(NhanVien nv: danhsachnhanvien){
      System.out.printf(String.valueOf(nv + "\n"));
    }
  }
  ;
}
