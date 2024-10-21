package structural.file;

import java.util.ArrayList;
import java.util.List;

class Folder extends FileSystemItem {
  List<FileSystemItem> files = new ArrayList<>();

  public Folder(String ten, String ngayTao) {
    super(ten, ngayTao);
  }

  @Override
  public String getPath() {
    StringBuilder path = new StringBuilder();
    path.append(ten).append("/");
    for(FileSystemItem item: files){
      path.append(item.getPath());
    }
    return path.toString();
    }

  @Override
  public String getStringTreeFolder() {
    StringBuilder builder = new StringBuilder();
    builder.append(ten).append("\n");
    for (FileSystemItem item : files) {
      builder.append("   ").append(item.getStringTreeFolder()).append("\n");
    }
    return builder.toString();
  }

  @Override
  public void addItem(FileSystemItem item) {
    files.add(item);
  }

  @Override
  public void removeItem(FileSystemItem item) {
    files.remove(item);
  }
}



