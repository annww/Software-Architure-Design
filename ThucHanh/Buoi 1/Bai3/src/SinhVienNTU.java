public abstract class SinhVienNTU {
    protected String hoTen;
    protected String nganh;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract float getDiemTB();

    public String getHocLuc(){
        float diemTB = getDiemTB();
        if(diemTB < 5){
            return "Yeu";
        }
        if(diemTB < 6.5){
            return "Trung binh";
        }
        if(diemTB < 8){
            return "Kha";
        }
        if(diemTB <9){
            return "Gioi";
        }
        return "Xuat sac";
    }

    public void inThongTin(){
        System.out.printf("Ho ten: " + hoTen + " , nganh hoc: " + nganh + ", diem TB: " + getDiemTB() + " , hoc luc: " + getHocLuc());
    }
}
