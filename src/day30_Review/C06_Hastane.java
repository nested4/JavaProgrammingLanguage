package day30_Review;

public class C06_Hastane {
    public static void main(String[] args) {
        Doktor hekim1 = new Doktor();     // instansce degiskenlere ancak oble olusturularak erisilebilir
        System.out.println(hekim1.cinsiyet);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);

        System.out.println("---------------------------");

        hekim1.isim = "Kaan";
        hekim1.soyIsim = "Sarp";
        hekim1.uzmanMi = true;
        hekim1.yas = 32;

        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);

        System.out.println(Doktor.fakulte);  // static degiskene Class ismi ile erisilebilir
        System.out.println(hekim1.fakulte); // obje ile de static degiskenlere erisilebilir

        Doktor.fakulte = "Hacettepe Tip Fakultesi"; // static degisken degistirilirse tum class icin ortak oldugundan
        System.out.println(hekim1);


        System.out.println("-----------------------------------");

        Doktor hekim2 = new Doktor();
        hekim2.isim = "Buket";
        System.out.println(hekim2.isim);
        System.out.println(hekim2.fakulte);
        System.out.println(Doktor.fakulte);


    }
}
