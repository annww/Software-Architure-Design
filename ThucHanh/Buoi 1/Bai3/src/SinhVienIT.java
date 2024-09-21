public class SinhVienIT extends SinhVienNTU {
    private float diemJava;
    private float diemCSS;
    private float diemHTML;

    public SinhVienIT(String hoTen, String nganh, float diemJava, float diemCSS, float diemHTML){
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public float getDiemTB(){
        return (2* diemJava + diemCSS + diemHTML) /4;
    }
}
