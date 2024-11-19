package observerpattern.baitapca1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
  private List<myStream_listener<T>> listeners = new ArrayList<>();

  public void addListener(myStream_listener<T> listener) {
    listeners.add(listener);
  }

  public void addEvent(T event) {
    for (myStream_listener<T> listener : listeners) {
      listener.onEvent(event);
    }
  }
}
