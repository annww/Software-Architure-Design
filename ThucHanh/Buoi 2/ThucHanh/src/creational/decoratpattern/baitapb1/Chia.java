package creational.decoratpattern.baitapb1;

class Chia extends BieuThucDecorator {
  private int toanHang;

  public Chia(BieuThuc bieuthuc, int toanHang) {
    super(bieuthuc);
    this.toanHang = toanHang;
  }

  @Override
  public float giaTri() {
    if (toanHang == 0) {
      System.out.println("Lỗi: Chia cho 0");
      return 0; // Tránh chia cho 0
    }
    return bieuthuc.giaTri() / toanHang;
  }

  @Override
  public String bieuThuc() {
    return "(" + bieuthuc.bieuThuc() + " / " + toanHang + ")";
  }
}
