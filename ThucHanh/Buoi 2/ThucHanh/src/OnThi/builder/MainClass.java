package OnThi.builder;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
  public static void main(String[] args) {
    SinhVien sv = new SinhVien("1", "Nguyen Van A", "11/10/2004", "Nha Trang");

    Monhoc m1 = new Monhoc("1", "Toan 1", 2);
    Monhoc m2 = new Monhoc("2", "Toan 2", 3);

    // Tạo danh sách môn học đăng ký và cải thiện
    List<Monhoc> dsMonHocDK = new ArrayList<>();
    dsMonHocDK.add(m1);
    dsMonHocDK.add(m2);

    List<Monhoc> dsMonHocCaiThien = new ArrayList<>();
    dsMonHocCaiThien.add(m1);

    // Sử dụng Builder để tạo KeHoachKyhoc với danh sách môn học
    KeHoachKyhoc keHoachKyHoc = new KeHoachKyHocBuilder()
        .setSinhVien(sv)
        .setDsMonHocDK(dsMonHocDK)         // Truyền vào danh sách
        .setDsMonHocCaiThien(dsMonHocCaiThien)  // Truyền vào danh sách
        .build();

    keHoachKyHoc.display();
  }
}
