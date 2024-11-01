package creational.composite;

import java.util.ArrayList;

public class MainClass {
  public static void main(String[] args) {
    KeHoachHT mon1 = new MonHoc(2,2000);
    KeHoachHT mon2 = new MonHoc(3,3000);
    KeHoachHT mon3 = new MonHoc(4,4000);

    KeHoachHT ky1 = new KeHoachChung(new ArrayList<>());
    KeHoachHT ky2 = new KeHoachChung(new ArrayList<>());
    KeHoachHT ky3 = new KeHoachChung(new ArrayList<>());
    ky1.add(mon1);
    ky1.add(mon2);
    System.out.println("So tin chi trong ky la: \n" + ky1.thongTin());
  }
}
