package observerpattern.baitapca1;

import java.util.List;

public class Client implements myStream_listener<List<MonHoc>> {
  private MyStream<List<MonHoc>> stream;

  public Client(MyStream<List<MonHoc>> stream) {
    this.stream = stream;
    this.stream.addListener(this); // Đăng ký listener
  }

  @Override
  public void onEvent(List<MonHoc> event) {
    System.out.println("Danh sách môn học được cập nhật:");
    for (MonHoc monHoc : event) {
      System.out.println(monHoc);
    }
  }
}
