package OnThi.builder;

import java.util.List;

public class KeHoachKyhoc {
  private SinhVien sinhVien;
  private List<Monhoc> dsMonHocDK;
  private List<Monhoc> dsMonHocCaiThien;

  public KeHoachKyhoc(SinhVien sinhVien, List<Monhoc> dsMonHocDK, List<Monhoc> dsMonHocCaiThien) {
    this.sinhVien = sinhVien;
    this.dsMonHocDK = dsMonHocDK;
    this.dsMonHocCaiThien = dsMonHocCaiThien;
  }

  public void display() {
    System.out.println("Thông tin sinh viên:");
    System.out.println(sinhVien.toString());

    System.out.println("Danh sách môn học đăng ký:");
    for (Monhoc mh : dsMonHocDK) {
      System.out.println(" - " + mh.toString());
    }

    System.out.println("Danh sách môn học cần cải thiện:");
    for (Monhoc mh : dsMonHocCaiThien) {
      System.out.println(" - " + mh.toString());
    }
  }

}
