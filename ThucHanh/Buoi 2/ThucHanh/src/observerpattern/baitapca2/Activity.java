package observerpattern.baitapca2;

public class Activity implements onClick{
  int clickCount = 0;

  @Override
  public void update() {
    clickCount++;
    System.out.println("Bạn click lần thứ : " + clickCount);
  }
}
