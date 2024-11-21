package observerpattern.baitapca2;

import java.util.Observer;

public class Button {
  onClick activity;

  public void setClick(onClick activity){
    this.activity = activity;
  }

  public void click(){
    if (activity != null){
      activity.update();
    }
  }
}
