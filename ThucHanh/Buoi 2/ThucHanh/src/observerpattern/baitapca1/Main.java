package observerpattern.baitapca1;
import observerpattern.baitapca1.MonHoc;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Tạo Stream
    MyStream<List<MonHoc>> stream = new MyStream<>();

    // Tạo Client và đăng ký với Stream
    Client client = new Client(stream);

    // Tạo DataManager
    DataAccess dataAccess = new DataAccess(stream);

    // Thêm, xóa, cập nhật dữ liệu
    MonHoc mon1 = new MonHoc("Toán", 3);
    MonHoc mon2 = new MonHoc("Lý", 4);
    MonHoc mon3 = new MonHoc("Hóa", 3);

    dataAccess.add(mon1);
    dataAccess.add(mon2);
    dataAccess.delete(mon1);
    dataAccess.update(0, mon3);
  }
}
