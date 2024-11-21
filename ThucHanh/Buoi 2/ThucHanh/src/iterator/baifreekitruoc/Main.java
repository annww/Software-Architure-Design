package iterator.baifreekitruoc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void duyetMonHoc(Iterator<MonHoc> iterator){
    while(iterator.hasNext()){
      MonHoc monHoc = iterator.next();
      System.out.println(monHoc.toString());
    }
  }

  public static void main(String[] args) {
    List<MonHoc> monHocList = new ArrayList<>(Arrays.asList(
        new MonHoc("Toan 1", "2"),
        new MonHoc("Cau truc du lieu", "3"),
        new MonHoc("Giai tich", "4"),
        new MonHoc("Mang MT", "3"),
        new MonHoc("Java", "2")
    )
    );
    duyetMonHoc(monHocList.iterator());
  }
}
