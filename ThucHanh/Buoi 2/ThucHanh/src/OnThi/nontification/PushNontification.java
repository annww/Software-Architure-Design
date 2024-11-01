package OnThi.nontification;

public class PushNontification extends GuiThongBao {
  @Override
  public Nontification taoThongBao() {
    Nontification thongBao = new Nontification() {
      @Override
      void taoThongBao() {
        System.out.printf("Tao thong bao \n");
      }

      @Override
      void guiThongBao() {
        System.out.printf("Gui thong bao \n");
      }

      @Override
      void duaThongBao() {
        System.out.printf("Dua thong bao \n");
      }
    };
    return thongBao;
  }
}
