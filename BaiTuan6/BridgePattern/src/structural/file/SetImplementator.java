package structural.file;

public interface SetImplementator<T>{
  void add(T data);
  T get(int index);
  void remove (int index);
}
