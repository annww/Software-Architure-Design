package structural.file;

abstract class FileSystemItem {
  protected String ten;
  protected String ngayTao;
  public String preStr = " ";

  public FileSystemItem(String ten, String ngayTao) {
    this.ten = ten;
    this.ngayTao = ngayTao;
  }

  public String getPath(){
    return "";
  }
  public String getStringTreeFolder(){
    return "";
  }
  public abstract void addItem(FileSystemItem item);
  public abstract void removeItem(FileSystemItem item);

}
