package builderpattern.baitapa5;

import java.util.ArrayList;
import java.util.List;

public class Sach {
  private String Title;
  private int Page;
  private String Author;
  private List<String> Chapters;

  public Sach(SachBuilder builder) {
    Title = builder.getTitle();
    Page = builder.getPage();
    Author = builder.getAuthor();
    Chapters = new ArrayList<>(builder.getChapters());
  }

  @Override
  public String toString() {
    return "Sach{" +
        "title='" + Title + '\'' +
        ", page=" + Page +
        ", author='" + Author + '\'' +
        ", chapters=" + Chapters +
        '}';
  }

  // Getters (nếu cần)
  public String getTitle() {
    return Title;
  }

  public int getPage() {
    return Page;
  }

  public String getAuthor() {
    return Author;
  }

  public List<String> getChapters() {
    return new ArrayList<>(Chapters);
  }
}
