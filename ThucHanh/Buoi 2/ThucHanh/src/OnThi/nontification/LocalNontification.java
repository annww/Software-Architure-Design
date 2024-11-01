package OnThi.nontification;

public class LocalNontification extends GuiThongBao{
  @Override
  public Nontification taoThongBao() {
    Nontification thongBao = new Nontification() {
      @Override
      void taoThongBao() {
        System.out.printf("Local da tao thong bao \n");
      }

      @Override
      void guiThongBao() {
        System.out.printf("Local da gui thong bao \n");
      }

      @Override
      void duaThongBao() {
        System.out.printf("Local da dua thong bao \n");
      }
    };
    return thongBao;
  }
}
