package BaiTapTH.BuilderPatternA1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
  private HoaDonHeader header;
  private List<CTHD> cthds;

  public HoaDon(Builder builder){
    this.header = builder.header;
    this.cthds = builder.cthds;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(header.toString());
    for(var cthd : cthds)
      builder.append("\n").append(cthd.toString());
      return builder.toString();
    }

  public static class Builder{
    HoaDonHeader header;
    List<CTHD> cthds = new ArrayList<>();

    public Builder setHeader(String maHD, String ngayBan, String tenKH){
      this.header = new HoaDonHeader(maHD, ngayBan, tenKH);
      return this;
    }

    // Them chi tiet hoa don
    public Builder addCTHD(String sanPham, int soLuong, int gia) {
      CTHD cthd = new CTHD(sanPham, soLuong, gia);
      this.cthds.add(cthd);
      return this;
    }

    public HoaDon build() {
      return new HoaDon(this);
    }
  }
}
