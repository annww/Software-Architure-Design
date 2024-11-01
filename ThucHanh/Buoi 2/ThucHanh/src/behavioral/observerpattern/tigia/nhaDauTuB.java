package behavioral.observerpattern.tigia;

public class nhaDauTuB implements thayDoiTiGia{
  tiGia t;
  public nhaDauTuB(tiGia t) {
    this.t = t;
    t.attach(this);
  }
  @Override
  public void Update(float delta) {
    if(delta > 0){
      System.out.printf("Nha dau tu B mua vao \n");
    }
    else System.out.printf("Nha dau tu B ban ra \n");
  }
}
