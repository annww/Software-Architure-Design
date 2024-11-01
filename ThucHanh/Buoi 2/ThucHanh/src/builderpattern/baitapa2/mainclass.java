package builderpattern.baitapa2;

public class mainclass {
  public static void main(String[] args) {
    MyStringBuilder builder = new MyStringBuilder();

    builder.addString("Hi \n");
    builder.addString("Bye \n");
    builder.addFloat(6.1f);
    builder.addBool(true);

    System.out.println(builder.toString());
  }
}
