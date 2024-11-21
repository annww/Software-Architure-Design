package iterator.baifreekitruoc;

public class MonHoc {
  String tenMH;
  String soTC;

  public MonHoc(String tenMH, String soTC) {
    this.tenMH = tenMH;
    this.soTC = soTC;
  }

  @Override
  public String toString() {
    return "MonHoc{" +
        "tenMH='" + tenMH + '\'' +
        ", soTC='" + soTC + '\'' +
        '}';
  }
}
