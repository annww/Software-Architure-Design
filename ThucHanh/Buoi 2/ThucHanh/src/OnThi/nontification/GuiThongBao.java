package OnThi.nontification;

public abstract class GuiThongBao {
  public abstract Nontification taoThongBao();
  public Nontification guiThongBao() {
    Nontification thongBao = taoThongBao();
    thongBao.taoThongBao();
    thongBao.duaThongBao();
    thongBao.guiThongBao();
    return thongBao;
  }
}
