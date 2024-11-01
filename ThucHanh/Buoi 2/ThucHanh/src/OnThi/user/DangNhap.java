package OnThi.user;

import java.util.ArrayList;
import java.util.List;

public class DangNhap {
  public static DangNhap instance;
  List<User> listUser;
  User user;

  private DangNhap(){
    listUser = new ArrayList<>();
  }

  public static DangNhap getInstance(){
    if(instance == null){
      instance = new DangNhap();
    }
    return instance;
  };

  public void login(User u){
    for(var i:instance.listUser){
      if(i.getUsername().equals(u.getUsername()) && i.getPassword().equals(u.getPassword())){
        instance.user = u;
        System.out.printf("Dang nhap thanh cong! \n");
      }
      else System.out.printf("Dang nhap that bai! \n");
    }

  }

  public void logout(){
    this.user = null;
    System.out.printf("Dang xuat thanh cong! \n");
  }

  @Override
  public String toString() {
    return "DangNhap{" +
        "listUser=" + listUser +
        ", user=" + user +
        '}';
  }
}
