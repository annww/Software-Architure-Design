package OnThi.nontification;

public class SMS extends GuiThongBao{
  @Override
  public Nontification taoThongBao() {
    Nontification thongBao = new Nontification(){

      @Override
      void taoThongBao() {
        System.out.printf("SMS da tao thong bao \n");
      }

      @Override
      void guiThongBao() {
        System.out.printf("SMS da gui thong bao \n");
      }

      @Override
      void duaThongBao() {
        System.out.printf("SMS da dua thong bao \n");
      }
    };
    return thongBao;
  }
}
