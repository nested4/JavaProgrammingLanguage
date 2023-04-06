package day22_ClassAndObject_Memory;

public class Main {

    public static void main(String[] args) {
/*
        Daire2 benimDairem=new Daire2();
        benimDairem.r=2;
        Daire2 seninDairen=new Daire2();
        seninDairen.r=5;
        System.out.println(benimDairem.alanHesapla());
        System.out.println(seninDairen.alanHesapla());
*/

      CarNew car1=new CarNew();
      car1.marka="Honda";
      car1.modelAdi="City";
      car1.begir=136;

        CarNew car2=new CarNew();
        car2.marka="Mecedes";
        car2.modelAdi="e200d";
        car2.begir=185;
     if(car1.begir> car2.begir) {
         System.out.println(car1.marka+" "+car1.modelAdi);
     } else{
         System.out.println(car2.marka+" "+car2.modelAdi);
     }





    }

    //CarNew adında bir class oluşturun
    //fieldları marka,modelAdı,begir
    // farklı bir class da CarNew clasından 2 adet obje tanımlayın
    // ve bu 2 adet objenin begirlerini karşılaştırın hangisinin
    // begiri büyük ise ekrana onun marka ve modelini yazın





}
