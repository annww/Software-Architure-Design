import java.util.List;
import java.util.ArrayList;

public class QuanLyNhanVien implements NhanVien.IQuanLy {
    private List<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien(){
        danhSachNhanVien = new ArrayList<>();
    }

    @Override
    public void them(NhanVien nv){
        danhSachNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nv : danhSachNhanVien){
            System.out.println(String.valueOf(nv));
        }
    }
}
