package singleton.baitapa6;

import java.util.List;

public interface dataAccess {
  void themSP(SanPham sp);
  void xoaSP(SanPham sp);
  void suaSP(SanPham sp);
  List<SanPham> layTatCaSP();
}
