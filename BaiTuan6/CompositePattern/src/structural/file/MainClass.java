package structural.file;

public class MainClass {
  public static void main(String[] args) {
    Folder root = new Folder("Data(D:)", "2024-10-17");
    Folder tailieu = new Folder("TaiLieu", "2024-10-18");
    root.addItem(tailieu);

    Folder designPattern = new Folder("Design Pattern", "2024-10-8");
    tailieu.addItem(designPattern);

    designPattern.addItem(new File("CreationalPattern.pptx", "2024-8-9"));
    designPattern.addItem(new File("StructuralPattern.pptx", "2024-8-9"));

    Folder lapTrinhJava = new Folder("Lap Trinh Java", "2024-09-08");
    tailieu.addItem(lapTrinhJava);

    lapTrinhJava.addItem(new File("LapTrinhJavaCoBan", "2024-10-11"));
    lapTrinhJava.addItem(new File("LapTrinhJavaNangCao", "2024-12-11"));

    Folder lapTrinhDiDong = new Folder("Lap Trinh Di Dong", "2024-01-09");
    tailieu.addItem(lapTrinhDiDong);

    lapTrinhDiDong.addItem(new File("CoBan.pptx", "2024-05-06"));
    lapTrinhDiDong.addItem(new File("NangCao.pptx", "2024-04-16"));

    System.out.printf(root.getStringTreeFolder());
    System.out.printf("Path: " + root.getPath());
  }
}
