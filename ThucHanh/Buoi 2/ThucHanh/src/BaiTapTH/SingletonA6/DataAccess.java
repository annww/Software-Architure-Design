  package BaiTapTH.SingletonA6;

  import java.util.ArrayList;
  import java.util.HashMap;
  import java.util.List;
  import java.util.Map;

  public class DataAccess {
    List<SanPham> sps = new ArrayList<>();
    private  static final Map<String, DataAccess> map = new HashMap<>();
    public DataAccess() {}
    public static DataAccess getInstance(String tag) {
      if (!map.containsKey(tag))
        map.put(tag, new DataAccess());
      return map.get(tag);
    }
    public void addsp(SanPham sanPham) {
      sps.add(sanPham);
    }
    public void display() {
      for (SanPham sanPham : sps) {
        System.out.println(sanPham.toString());
      }
    }
    public List<SanPham> getSps() {
      return sps;
    }

  }