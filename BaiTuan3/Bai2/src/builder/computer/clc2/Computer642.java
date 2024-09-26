package builder.computer.clc2;

public class Computer642 {
  String CPU, ram, screen, storage;

  protected Computer642(Builder builder){
    this.CPU =  builder.CPU;
    this.ram =  builder.ram;
    this.storage =  builder.storage;
    this.screen = builder.screen;
  }

  public static class Builder{
    String CPU, ram, screen, storage;

    public Builder builCPU(String CPU){
      this.CPU = CPU;
      return this;
    }
    public Builder builram(String ram){
      this.ram = ram;
      return this;
    }
    public Builder builstorage(String storage){
      this.storage = storage;
      return this;
    }
    public Builder builscreen(String screen){
      this.screen = screen;
      return this;
    }

    public Computer642 Build(){
      return new Computer642(this);
    }
  }

  @Override
  public String toString() {
    return "Computer642{" +
        "CPU='" + CPU + '\'' +
        ", ram='" + ram + '\'' +
        ", screen='" + screen + '\'' +
        ", storage='" + storage + '\'' +
        '}';
  }
}
