package day55_MapAndFinish;

import java.util.ArrayList;

public class Ogrenci {

    private String isim;
    public String soyIsim;
    private int no;
    private ArrayList<String> dersler=new ArrayList<>();

    public Ogrenci(String isim, String soyIsim, int no) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", no=" + no +
                ", dersler=" + dersler +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void ekleDers(String ders) {
      this.dersler.add(ders);
    }


}
