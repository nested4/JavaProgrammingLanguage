package day07_Aritmetic_Operators;

public class Aritmetic_Operators_2 {

    public static void main(String[] args){
      /* int x=4;
       int y=10;
     double z=(double)x/y;
      System.out.print(z);

       double sonuc = 35 + 12 / 3 % 2 * (3-1);
                   // 35 +12/3%2*2
        //            35+4%2*2
        //            35+0*2
                   // 35+0
                   //  35

*/


//Ali ile Ahmet kardeştir.
// Ali 1990 yılında doğmuştur. Ali ,Ahmet den
// 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.
/*
        int dogumYil=1990;
        int yas=2023-dogumYil;
        int ahmetYas=yas-5;
        // System.out.print("Ahmet yas: "+(yas-5));
        System.out.print("Ahmet yas: "+ahmetYas);





        //2 cm yarıçapına sahip dairenin
        // alanı ve çevresini hesaplayın? (PI=3.14)

        // System.out.print(Math.sqrt(49));
        double PI=3.14;
        double r=4;
        double alan=PI*r*r;
        double alan2=Math.PI*Math.pow(r,2);
        System.out.println("alan: "+alan);
        System.out.println("alan2: "+alan2);

        double cevre=2*PI*r;
        System.out.println("cevre: "+cevre);
        System.out.println("cevre: "+(2*PI*r));


        //300 Fahrenheit kaç Celsius ‘dur?
        // (°C=(°F-32)/1.8)

         double f=300;
         double c=(f-32)/1.8;
         System.out.print(f+" fahrenheit "+c+" celciusdur");

         //32 Celsius kaç Fahrenheit ‘dır? (°C=(°F-32)/1.8)
        double c=32;
        double f=(c*1.8)+32;
        System.out.print(f+" fahrenheit "+c+" celciusdur");







//Ali fizik dersinden 92,
// kimya dersinden 55,
// matematik dersinden 89 almıştır.
//1.Ali’nin not ortalaması kaçtır?
        double f=92.5;
        double k=90;
        double m=89;
        double ort=(f+k+m)/3;
        System.out.println(ort);


        //Ortalama sınıf geçme notu 80 üzeri olduğuna göre
        // Ali’nin sınıfı
        // geçti ise ekrana true geçmedi ise false yazdırın.
        boolean isPas=(ort>80);
        System.out.print("Ali sınıfı geçti mi:"+(ort>80));
         */




        //Toplantı salonunda 15 adet sıra ve her sırada
        // 12 adet koltuk vardır. Toplantıya 113 katılmıştır.




        //5.Oturulan sıralarda kaç adet boş koltuk vardır?

        int sira=15;
        int siraKoltukAdet=12;
        int katilimciSayisi=113;
        //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite=sira*siraKoltukAdet;
        System.out.println("kapasite = " + kapasite);

        // 2.Kaç adet boş koltuk vardır ?
        int bosKoltukAdet=kapasite-katilimciSayisi;
        System.out.println("bosKoltukAdet = " + bosKoltukAdet);

        //3.Kaç adet sırada oturulmaktadır ?
        int oturulanSiraAdeti=katilimciSayisi/siraKoltukAdet+1;
        System.out.println("oturulanSiraAdeti = " + oturulanSiraAdeti);

        //4. Kaç sıra tamamen boş kalmıştır.
        int bosSiraAdeti=sira-oturulanSiraAdeti;
        System.out.println("bosSiraAdeti = " + bosSiraAdeti);

        //5.Oturulan sıralarda kaç adet boş koltuk vardır?
        int oturulansiradakiBosKoltuk=siraKoltukAdet-(katilimciSayisi%12);
        System.out.println("oturulansiradakiBosKoltuk = " + oturulansiradakiBosKoltuk);


    }

}
