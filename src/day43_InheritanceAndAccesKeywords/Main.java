package day43_InheritanceAndAccesKeywords;

public class Main {

    public static void main(String[] args) {

        System.out.println(Sekiller.a);
        //  Parent harun=new Parent("harun","mehmet","ahmet");
      //  Child aslan =new Child("harun","mehmet","ahmet");
        //System.out.println(aslan.parentName);

Vehicle vehicle=new Vehicle();
Automobile automobile=new Automobile();
Motorcycle motorcycle=new Motorcycle();


Sekiller sekil=new Sekiller();
        System.out.println(sekil.getClass().toString());


//sekil.alanHesapla();
        /*
Daire daire=new Daire();
daire.yariCap=2;
        //System.out.println(daire.alanHesapla());
        Kare kare=new Kare();
        kare.kenarUzunlugu=5;
        System.out.println(kare.alanHesapla());

Motorcycle motorcycle1=Motorcycle.motorsikletOlustur(100);
        System.out.println(motorcycle1.getCc());
*/
    }





}
