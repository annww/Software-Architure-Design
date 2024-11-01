package builderpattern.baitapa5;

import java.util.Arrays;

public class MainClass {
  public static void main(String[] args) {
    // Tạo một đối tượng SachBuilder
    SachBuilder builder = new SachBuilder();

    // Thiết lập các thuộc tính cho cuốn sách
    Sach sach = builder
        .setTitle("Hành trình vào tâm trí")
        .setPage(300)
        .setAuthor("Nguyễn Văn A")
        .addChapter("Chương 1: Khởi đầu")
        .addChapter("Chương 2: Khám phá")
        .addChapter("Chương 3: Kết thúc")
        .build();

    // In thông tin cuốn sách
    System.out.println(sach);
  }
}
