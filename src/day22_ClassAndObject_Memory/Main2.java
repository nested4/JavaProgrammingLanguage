package day22_ClassAndObject_Memory;

public class Main2 {


    public static void main(String[] args) {

        System.out.println(Daire2.alanHesapla2(5));
        System.out.println(Daire2.cevreHesapla2(7));
Daire2 yeniDaire=new Daire2();
yeniDaire.r=3;
        System.out.println(yeniDaire.alanHesapla());
    }
}
