package builderpattern.baitapa1;

public class mainclass {
  public static void main(String[] args) {
    HoaDon hoaDon = new HoaDon.HoaDonBuilder()
        .setHeader("HD001", "28-10-2024", "Nguyen Van A")
        .addDetails("Laptop", 1, 15000000, 0.1)
        .addDetails("Chuột", 2, 200000, 0.05)
        .build();

    // Hiển thị thông tin hóa đơn
    System.out.println("Mã hóa đơn: " + hoaDon.getHeader().getMaHoaDon());
    System.out.println("Ngày bán: " + hoaDon.getHeader().getNgayBan());
    System.out.println("Tên khách hàng: " + hoaDon.getHeader().getTenKH());

    System.out.println("Chi tiết hóa đơn:");
    for (CTHD chiTiet : hoaDon.getChiTietHoaDon()) {
      System.out.println("- Sản phẩm: " + chiTiet.getSanPham() +
          ", Số lượng: " + chiTiet.getSoLuong() +
          ", Đơn giá: " + chiTiet.getDonGia() +
          ", Chiết khấu: " + chiTiet.getChietKhau());
    }
  }
}

