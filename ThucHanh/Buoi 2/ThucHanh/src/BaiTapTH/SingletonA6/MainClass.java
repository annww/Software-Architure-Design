package BaiTapTH.SingletonA6;

public class MainClass {
      public static void main(String[] args) {
        DataAccess u1 = DataAccess.getInstance("1");
        DataAccess u2 = DataAccess.getInstance("2");
        DataAccess u3 = DataAccess.getInstance("2");
        u1.addsp(new SanPham("1","Dien thoai",200000,2));
        u2.addsp(new SanPham("2", "May tinh", 100000,3));
        u3.addsp(new SanPham("3","Tablet", 150000, 4));
        System.out.println("U1:");
        u1.display();
        System.out.println("U2:");
        u2.display();
        System.out.println("U3:");
        u3.display();
      }
    }
