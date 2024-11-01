package creational.decoratpattern.tokenize;

import java.util.List;

public abstract class TokenDecorator implements ITokenzie {
  ITokenzie tokens;

  public TokenDecorator(ITokenzie tokenzie) {
    this.tokens = tokenzie;
  }

  @Override
  public List<String> tokenzie() {
    return List.of();
  }
}
