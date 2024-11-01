package creational.decoratpattern.tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoaiBoTuDung extends TokenDecorator{
  List<String> list = List.of("và", "hoặc", "thì", "mà", "là");

  public LoaiBoTuDung(ITokenzie tokens) {
    super(tokens);
  }

  @Override
  public List<String> tokenzie() {
    List<String> t = tokens.tokenzie();
    t.removeAll(list);
    return t;
  }

}
