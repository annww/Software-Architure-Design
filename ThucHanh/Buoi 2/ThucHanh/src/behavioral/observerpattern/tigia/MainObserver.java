package behavioral.observerpattern.tigia;

public class MainObserver {
  public static void main(String[] args) {
    tiGia t = new tiGia();
    nhaDauTuA a = new nhaDauTuA(t);
    nhaDauTuB b = new nhaDauTuB(t);
    System.out.printf("Lan 1: ");
    t.notify(5);
    System.out.printf("Lan 2: ");
    t.notify(-5);
  }
}
