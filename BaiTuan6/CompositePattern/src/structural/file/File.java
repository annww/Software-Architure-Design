package structural.file;

class File extends FileSystemItem{
  public File(String ten, String ngayTao) {
    super(ten, ngayTao);
  }

  @Override
  public String getPath() {
    return this.preStr + ten;
  }

  @Override
  public String getStringTreeFolder() {
    return this.preStr + ten;
  }

  @Override
  public void addItem(FileSystemItem item) {

  }

  @Override
  public void removeItem(FileSystemItem item) {

  }
}
