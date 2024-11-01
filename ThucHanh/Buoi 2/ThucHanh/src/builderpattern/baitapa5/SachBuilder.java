package builderpattern.baitapa5;

import java.util.ArrayList;
import java.util.List;

public class SachBuilder {
  private String Title;
  private int Page;
  private String Author;
  private List<String> Chapters;

  public SachBuilder() {
    Chapters = new ArrayList<>();
  }

  public SachBuilder setTitle(String title) {
    Title = title;
    return this;
  }

  public SachBuilder setPage(int page) {
    Page = page;
    return this;
  }

  public SachBuilder setAuthor(String author) {
    Author = author;
    return this;
  }

  public SachBuilder addChapter(String chapter) {
    Chapters.add(chapter);
    return this;
  }

  public Sach build() {
    return new Sach(this);
  }

  // Getters
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
