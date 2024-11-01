package creational.decoratpattern.baitapb1;

public class BieuThucDonGian extends BieuThuc{
  private float toanHang;

  public BieuThucDonGian(float toanHang) {
    this.toanHang = toanHang;
  }

  @Override
  public float giaTri() {
    return toanHang;
  }

  @Override
  public String bieuThuc() {
    return Float.toString(toanHang);
  }

  @Override
  public String toString() {
    return "BieuThucDonGian{" +
        "ToanHang=" + toanHang +
        '}';
  }
}