package creational.composite;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHT{
  List<KeHoachHT> keHoachHTList = new ArrayList<>();

  public KeHoachChung(List<KeHoachHT> keHoachHTList) {
    this.keHoachHTList = keHoachHTList;
  }

  @Override
  public void add(KeHoachHT k) {
    keHoachHTList.add(k);
  }

  @Override
  public void remove(KeHoachHT k) {
    keHoachHTList.remove(k);
  }

  @Override
  public int getsoTC() {
    int tongSoTC = 0;
    for(KeHoachHT k : keHoachHTList){
      tongSoTC += k.getsoTC();
    }
    return tongSoTC;
  }

  @Override
  public int gethocPhi() {
    int tongHocPhi = 0;
    for(KeHoachHT k : keHoachHTList){
      tongHocPhi += k.gethocPhi();
    }
    return tongHocPhi;
  }

  @Override
  public String thongTin() {
    StringBuilder sb = new StringBuilder();
    for(KeHoachHT k: keHoachHTList){
      sb.append("  ").append(k.thongTin()).append("\n");
    }
    sb.append("Tổng số tính chỉ: ").append(getsoTC()).append("  ")
        .append("Tổng số học phí: ").append(gethocPhi());
    return sb.toString();
  }
}
