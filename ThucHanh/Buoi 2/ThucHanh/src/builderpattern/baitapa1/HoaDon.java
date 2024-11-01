package builderpattern.baitapa1;

import BaiTapTH.BuilderPatternA1.HoaDonHeader;

import java.util.ArrayList;

public class HoaDon {
    private hoaDonHeader header;
    private ArrayList<CTHD> chiTietHoaDon;

    private HoaDon(HoaDonBuilder builder){
      this.header = builder.header;
      this.chiTietHoaDon = builder.chiTietHoaDon;
    }

    public hoaDonHeader getHeader() {
      return header;
    }

    public ArrayList<CTHD> getChiTietHoaDon() {
      return chiTietHoaDon;
    }

  public static class HoaDonBuilder{
    private hoaDonHeader header;
    private ArrayList<CTHD> chiTietHoaDon = new ArrayList<>();

    public HoaDonBuilder setHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
      this.header = new hoaDonHeader(maHoaDon,ngayBan,tenKhachHang);
      return this;
    }

    public HoaDonBuilder addDetails(String sanPham, int soLuong, double donGia, double chietKhau){
      CTHD details = new CTHD(sanPham,soLuong,donGia,chietKhau);
      chiTietHoaDon.add(details);
      return this;
    }

    public HoaDon build(){
      return new HoaDon(this);
    }

  }
}

