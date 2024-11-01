package behavioral.observerpattern.tigia;

import java.util.ArrayList;
import java.util.List;

public class tiGia {
  List<thayDoiTiGia> observer = new ArrayList<>();
  public void attach(thayDoiTiGia o){
    observer.add(o);
  }
  public void detach(thayDoiTiGia o){
    observer.remove(o);
  }
  public void notify(float delta){
    for(var o: observer){
      o.Update(delta);
    }
  }
}
