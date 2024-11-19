package OnThi.builder;

import java.util.ArrayList;
import java.util.List;

public class KeHoachKyHocBuilder {
  private SinhVien sinhVien;
  private List<Monhoc> dsMonHocDK = new ArrayList<>();
  private List<Monhoc> dsMonHocCaiThien = new ArrayList<>();

  public KeHoachKyHocBuilder setSinhVien(SinhVien sinhVien) {
    this.sinhVien = sinhVien;
    return this;
  }

  public KeHoachKyHocBuilder setDsMonHocDK(List<Monhoc> dsMonHocDK) {
    this.dsMonHocDK = dsMonHocDK;
    return this;
  }

  public KeHoachKyHocBuilder setDsMonHocCaiThien(List<Monhoc> dsMonHocCaiThien) {
    this.dsMonHocCaiThien = dsMonHocCaiThien;
    return this;
  }

  public KeHoachKyhoc build(){
    return new KeHoachKyhoc(sinhVien, dsMonHocDK,dsMonHocCaiThien);
  }
}
