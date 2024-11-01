package creational.decoratpattern.tokenize;

public class MainClass {
  public static void main(String[] args) {
    ITokenzie tokens = new TachTu("Đây là ví dụ để tách từ, và loại bỏ từ dừng, hoặc dấu câu!");
    System.out.println(tokens.tokenzie());
    ITokenzie tokenLoaiBoDauCau = new LoaiBoDauCau(tokens);
    System.out.println(tokens.tokenzie());
  }
}
