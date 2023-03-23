package day19_Custommethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        int sonuc = faktoriyelHesapla(4);
        System.out.println("sonuc = " + sonuc);
    }




    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun
    /* Method olusturma asamalari
    1.public static (standart)
    2.olusturacagimiz metod bize bir sonuc dondurecekse data tipini belirtmek gerekiyor
    3.metod adi
    4.metodun parantezi() parametre olup olmayacagi ve parametre data tipleri ve isimleri parantez icerisine yazilir
    5 {} bodu ac, dondurulmesi islemi yap,
    6.return keywordu ile dondurulmesi planlanan degeri dondur
     */

    public static int faktoriyelHesapla(int sayi){
        int faktoriyel=1;
        for (int i=1; i<=sayi;i++){
            faktoriyel*=i;
        }
        return faktoriyel;
    }




}
