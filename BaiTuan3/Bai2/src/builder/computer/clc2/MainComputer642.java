package builder.computer.clc2;

public class MainComputer642 {
  public static void main(String[] args) {
    Computer642 computer = new Computer642.Builder()
        .builCPU("Intel core i5")
        .builram("256GB")
        .builstorage("256")
        .builscreen("16 inch")
        .Build();
    System.out.printf(computer.toString());
  }
}
