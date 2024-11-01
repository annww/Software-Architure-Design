package creational.decoratpattern.baitapb1;

public class Cong extends BieuThucDecorator {
  private float toanHang;

  public Cong(BieuThuc bieuthuc, float toanHang) {
    super(bieuthuc);
    this.toanHang = toanHang;
  }

  @Override
  public float giaTri() {
    return bieuthuc.giaTri() + toanHang;
  }

  @Override
  public String bieuThuc() {
    return bieuthuc.bieuThuc() + " + " + toanHang;
  }
}
