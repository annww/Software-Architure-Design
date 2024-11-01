package creational.decoratpattern.baitapb1;

public class Tru extends BieuThucDecorator{
  private float ToanHang;

  public Tru(BieuThuc bieuThuc, float toanHang) {
    super(bieuThuc);
    ToanHang = toanHang;
  }

  @Override
  public float giaTri() {
    return bieuthuc.giaTri() - ToanHang;
  }

  @Override
  public String bieuThuc() {
    return bieuthuc.bieuThuc() + " - " + ToanHang;
  }
}
