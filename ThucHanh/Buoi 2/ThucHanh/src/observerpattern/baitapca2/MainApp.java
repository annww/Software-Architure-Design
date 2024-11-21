package observerpattern.baitapca2;

public class MainApp {
  public static void main(String[] args) {
      Button button = new Button();
      Activity activity = new Activity();

      button.setClick(activity);

      button.click();
      button.click();
      button.click();
  }
}
