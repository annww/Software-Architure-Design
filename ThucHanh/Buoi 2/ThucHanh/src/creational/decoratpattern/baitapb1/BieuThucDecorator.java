package creational.decoratpattern.baitapb1;

import java.util.ArrayList;
import java.util.List;

abstract class BieuThucDecorator extends BieuThuc {
  protected BieuThuc bieuthuc;

  public BieuThucDecorator(BieuThuc bieuthuc) {
    this.bieuthuc = bieuthuc;
  }
}
