package creational.nhanVien;

public class MainClass {
  public static void main(String[] args) {
    QuanLyNhanVien qlnv = new QuanLyNhanVien();

    // khoi tao 2 bien nhan vien
    NhanVien nv1 = new NhanVien("Duong Thi Anh Hong", 19, "175 Ly Tu Trong", 10000.0,300);
    NhanVien nv2 = new NhanVien("Duong Minh Hoang", 29, "200 Nguyen Trai", 12000.0,350);
    NhanVien nv3 = new NhanVien("Ho Xinh",20,"50 Thap Ba",12000.0,230);

    // them nhan vien
    qlnv.themNhanVien(nv1);
    qlnv.themNhanVien(nv2);
    qlnv.themNhanVien(nv3);

    // in ra danh sach
    qlnv.inDS();
  }
}
