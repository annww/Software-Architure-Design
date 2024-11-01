package behavioral.observerpattern.tigia;

public class nhaDauTuA implements thayDoiTiGia{
  tiGia t;

  public nhaDauTuA(tiGia t) {
    this.t = t;
    t.attach(this);
  }

  @Override
  public void Update(float delta) {
    if(delta > 0){
      System.out.printf("Nha dau tu A ban ra \n");
    } else
      System.out.printf("Nha dau tu A mua vao \n");
  }
}
