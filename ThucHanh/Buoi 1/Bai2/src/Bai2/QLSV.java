package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QLSV {

  private List<SinhVien> dssv;
  List<SinhVien> sv1 = new ArrayList<>();
  ISoSanh<SinhVien> isoSanh;

  public QLSV(){
    ArrayList<Object> dssv = new ArrayList<>();
  }

  public void sapXep(){
    sv1.sort((o1, o2) -> isoSanh.soSanh(o1,o2));
  }

  public void setSoSanh(ISoSanh<SinhVien> soSanh) {
    this.isoSanh = soSanh;
  }

  public void themSinhVien(SinhVien sv){
    dssv.add(sv);
  }

  public void inDS(){
    for(SinhVien sv : dssv){
      System.out.printf(String.valueOf(sv));
    }
  }
}



