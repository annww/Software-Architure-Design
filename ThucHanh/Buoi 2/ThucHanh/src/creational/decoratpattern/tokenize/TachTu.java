package creational.decoratpattern.tokenize;

import java.util.ArrayList;
import java.util.List;

public class TachTu implements ITokenzie {
  String s;

  public TachTu(String s) {
    this.s = s;
  }

  @Override
  public List<String> tokenzie() {
    List<String> list = new ArrayList<>();
    list.addAll(List.of(s.split(" ")));
    return list;
  }
}
