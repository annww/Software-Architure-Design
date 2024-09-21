package Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    SinhVien sv1 = new SinhVien("Nguyen Van A", dateFormat.parse("01/01/2000"), 8.5f);
    SinhVien sv2 = new SinhVien("Le Thi B", dateFormat.parse("02/02/2000"), 7.0f);
    SinhVien sv3 = new SinhVien("Tran Van C", dateFormat.parse("03/03/2000"), 9.0f);

    QLSV qlsv = new QLSV();

    qlsv.themSinhVien(sv1);
    qlsv.themSinhVien(sv2);
    qlsv.themSinhVien(sv3);

    System.out.println("Danh sach sinh vien theo ten:");
    qlsv.setSoSanh(new SoSanhTheoTen());
    qlsv.sapXep();
    qlsv.inDS();

    // Sort by score
    System.out.println("\nDanh sach sinh vien theo diem:");
    qlsv.setSoSanh(new SoSanhTheoDiem());
    qlsv.sapXep();
    qlsv.inDS();
  }
}

