public class MainApp {
    public static void main(String[] args) {
        QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();

        NhanVien nhanvien1 = new NhanVien("Nguyenn A", 20, "123 duong ABC", 10000, 210);
        NhanVien nhanvien2 = new NhanVien("Ho K", 20, "174 Ly Tu Trong", 20000,500);
        NhanVien nhanvien3 = new NhanVien("Ha N", 18,"160 Nguyen Trai", 30000, 400);
        NhanVien nhanvien4 = new NhanVien("My H", 18,"18 Nguyen Binh Khiem", 15000, 400);
        NhanVien nhanvien5 = new NhanVien("Yen N", 19,"1 Bach Dang", 116000, 420);

        //Them nhan vien vao trong danh sach
        qlNhanVien.them(nhanvien1);
        qlNhanVien.them(nhanvien2);
        qlNhanVien.them(nhanvien3);
        qlNhanVien.them(nhanvien4);
        qlNhanVien.them(nhanvien5);

        // In thong tin nhan vien
        System.out.println(nhanvien1.toString());
        System.out.println("Tien thuong: " + nhanvien1.tinhThuong() +" VND");

        // In thong tin nhan vien 2
        System.out.println(nhanvien2.toString());
        System.out.println("Tien thuong: " + nhanvien2.tinhThuong() + " VND");

        // In ra danh sach
        qlNhanVien.inDS();
    }
}
