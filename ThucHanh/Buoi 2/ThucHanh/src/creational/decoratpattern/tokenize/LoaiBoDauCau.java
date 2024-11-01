package creational.decoratpattern.tokenize;

import java.util.List;

public class LoaiBoDauCau extends TokenDecorator {

  public LoaiBoDauCau(ITokenzie tokenzie) {
    super(tokenzie);
  }

  @Override
  public List<String> tokenzie() {
    List<String> list = tokens.tokenzie();
    List<String> result = tokens.tokenzie();
    for(var s:list){
      s.replaceAll("\\p{Punct}"," ");
    }
    return result;
  }
}
