package observerpattern.baitapca6;

public class DashBoard implements PlayerData_listener{
  @Override
  public void listener(PlayerData data) {
    hienThi(data.getThoiGian(), data.getDiem(), data.getSoLuong());
  }
    public void hienThi(int thoiGian, int Diem, int soLuong){
      System.out.println("---Danh sach nguoi choi---");
      System.out.println("Thoi gian con lai: " + thoiGian);
      System.out.println("So luong con lai: " + soLuong);
      System.out.println("Diem so: " + Diem);
      System.out.println("--------------");
  }
}
