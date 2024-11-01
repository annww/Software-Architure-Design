package OnThi.user;

public class MainClass {
  public static void main(String[] args) {
    DangNhap dangNhap = DangNhap.getInstance();

    User user1 = new User("An","123");
//    User user2 = new User("Hong","321");
//    User user3 = new User("Pink","678");
//    User user4 = new User("K","12");

    dangNhap.listUser.add(user1);
//    dangNhap.listUser.add(user2);
//    dangNhap.listUser.add(user3);
//    dangNhap.listUser.add(user4);

    User u = new User("An","123");
    dangNhap.login(user1);
    dangNhap.logout();
    dangNhap.toString();

  }
}
