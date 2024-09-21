public class NhanVien {
    public String name;
    public int tuoi;
    public String diaChi;
    public double tienLuong;
    public int tongSoGioLam;

    // Constructor khong tham so
    public NhanVien() {
        this.name = "";
        this.tuoi = 0;
        this.diaChi = "";
        this.tienLuong = 0.0;
        this.tongSoGioLam = 0;
    }

    // Constructor co tham so
    public NhanVien(String name, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.name = name;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    // Getter va setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    // toString()
    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", tienLuong=" + tienLuong +
                ", tongSoGioLam=" + tongSoGioLam +
                '}';
    }

    public double tinhThuong(){
        if(tongSoGioLam >= 200){
            return tienLuong*0.2;
        }
        else if(tongSoGioLam < 200 && tongSoGioLam >= 100){
            return tienLuong*0.1;
        }
        else if(tongSoGioLam < 100){
            return tienLuong;
        }
        return 0;
    }

    interface IQuanLy{
        void them(NhanVien nv);
        void inDS();
    }
}
