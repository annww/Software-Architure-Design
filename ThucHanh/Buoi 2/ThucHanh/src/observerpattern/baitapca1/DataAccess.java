package observerpattern.baitapca1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
  private MyStream<List<MonHoc>> stream;
  private List<MonHoc> danhSachMonHoc;

  public DataAccess(MyStream<List<MonHoc>> stream) {
    this.stream = stream;
    this.danhSachMonHoc = new ArrayList<>();
  }

  public void add(MonHoc monHoc) {
    danhSachMonHoc.add(monHoc);
    stream.addEvent(new ArrayList<>(danhSachMonHoc));
  }

  public void delete(MonHoc monHoc) {
    danhSachMonHoc.remove(monHoc);
    stream.addEvent(new ArrayList<>(danhSachMonHoc));
  }

  public void update(int index, MonHoc monHoc) {
    if (index >= 0 && index < danhSachMonHoc.size()) {
      danhSachMonHoc.set(index, monHoc);
      stream.addEvent(new ArrayList<>(danhSachMonHoc));
    }
  }
}
