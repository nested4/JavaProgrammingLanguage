package day28_QuizAnswers;

public class C05_CodingAnswer2 {
    public static void main(String[] args) {
        vucutKitleEndeksiHesapla(87,186);
    }

   public static void vucutKitleEndeksiHesapla(int kilo,int boy){
      double vucutKitleEndeksi =0;
      vucutKitleEndeksi =(kilo*10000 / (boy *boy));
      if(vucutKitleEndeksi>=30) System.out.println("Obez");
      else if (vucutKitleEndeksi<30 && vucutKitleEndeksi>=25) System.out.println("Kilolu");
      else if (vucutKitleEndeksi<25 && vucutKitleEndeksi>=20) System.out.println("Normal");
      else System.out.println("Zayif");
   }
}
/*Kullanicinin kilo(kg) ve boyunu(cm) isteyip
Aldiginiz degerleri bir metoda gondererek hesaplatin
vucutKitleEndeksiHesapla(kilo,boy)
vucut kitle endeksi = (kilo*10000 / (boy *boy))
vucut kitle endeksi
30’dan buyukse obez,
25-30 arasi ise kilolu,
20-25 arasi ise normal,
20’den kucukse zayif yazdirin.*/