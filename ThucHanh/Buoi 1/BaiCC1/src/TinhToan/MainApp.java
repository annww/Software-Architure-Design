package TinhToan;

public class MainApp {
  public static void main(String[] args) {
      Context context = new Context();

      // Thuc hien phep toan 75 + 12
    context.setTinhToan(new Cong());
    float ketquaCong = context.tinh(75,12);
    System.out.println("Ket qua cua phep tinh 75 + 12: "+ ketquaCong);

    // Thuc hien phep toan 54 - 78
    context.setTinhToan(new Tru());
    float ketquaTru = context.tinh(54,78);
    System.out.println("Ket qua cua phep tinh 54 - 78: " + ketquaTru);
  }
}
