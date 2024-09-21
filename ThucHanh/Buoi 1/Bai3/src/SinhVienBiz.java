public class SinhVienBiz extends SinhVienNTU{
    private float diemMarketing;
    private float diemSale;

    public SinhVienBiz(String hoTen, String nganh, float diemMarketing, float diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public float getDiemTB() {
        return (2* diemMarketing + diemSale)/3;
    }
}
