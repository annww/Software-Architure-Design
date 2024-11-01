package creational.decoratpattern.baitapb1;

class Nhan extends BieuThucDecorator {
  private int toanHang;

  public Nhan(BieuThuc bieuthuc, int toanHang) {
    super(bieuthuc);
    this.toanHang = toanHang;
  }

  @Override
  public float giaTri() {
    return bieuthuc.giaTri() * toanHang;
  }

  @Override
  public String bieuThuc() {
    return "(" + bieuthuc.bieuThuc() + " * " + toanHang + ")";
  }
}