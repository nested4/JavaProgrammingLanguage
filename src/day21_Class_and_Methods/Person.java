package day21_Class_and_Methods;

public class Person {
//isim cinsiyet yaş fields
    //uyu() oyunOyna ()

    String isim;
    String cinsiyet;
    int yas;
    String tcNo;
    boolean a;
    double yilSonuOrtalamasi;

    public void uyu(){
        System.out.println(isim+" uyuyor");
    }

    public void  oyunOyna(){
        System.out.println(isim+ " oyun oynuyor");
    }

    public void tumBilgileriGetir(){
        System.out.println("isim:"+isim);
        System.out.println("yas: "+yas);
        System.out.println("cinsiyet: "+cinsiyet);
        System.out.println("Kimlik numarası:"+tcNo);
    }

    public static String ortalama(double x){
        if(x<50){
            return "c";
        }else if(x<75){
            return "b";
        }else {
            return "a";
        }





    }





}
