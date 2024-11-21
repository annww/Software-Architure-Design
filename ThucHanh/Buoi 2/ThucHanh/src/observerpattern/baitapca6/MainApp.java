package observerpattern.baitapca6;

public class MainApp {
  public static void main(String[] args) {
    DashBoard dashBoard = new DashBoard();

    PlayerData playerData = new PlayerData(12,2,0);

    playerData.dangKy(dashBoard);
    playerData.setThoiGian(5);
    playerData.setDiem(20);
    playerData.setSoLuong(5);
    
  }
}
