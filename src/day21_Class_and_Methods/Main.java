package day21_Class_and_Methods;

public class Main {

    public static void main(String[] args) {
        Person cemile=new Person();
        cemile.yas=35;
        cemile.isim="cemile";
        cemile.cinsiyet="Bayan";
        cemile.tcNo="12242321421";
        cemile.yilSonuOrtalamasi=45;

        Person cavit=new Person();
        cavit.yas=40;
        cavit.isim="cavit";
        cavit.cinsiyet="Bay";
        cavit.tcNo="343242312421";
        cavit.yilSonuOrtalamasi=80;

        System.out.println(Person.ortalama(cemile.yilSonuOrtalamasi));

        //  System.out.println((cavit.yas + cemile.yas));
//cavit.oyunOyna();

      //  System.out.println(cavit.a);
       /* Daire daire1=new Daire();
        daire1.r=5;
        Daire daire2=new Daire();
        daire2.r=20;
        daire1.alanHesapla();
        daire2.alanHesapla();
*/
    }
}
