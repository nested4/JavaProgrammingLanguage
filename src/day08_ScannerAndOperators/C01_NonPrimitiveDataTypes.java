package day08_ScannerAndOperators;

public class C01_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        String fullName = "Ali OZTURK";

        String firstLetter = "A";
        char firstLetter2 = 'B';


        //primitive data turunde variable lar sadec data tasiyor
        //nonprimitive data turunde hem deger tasiyorlar hem de methodlari var.
        //System.out.println(firstLetter.toLowerCase());

        String metin = "asdalskdjaslkdjalskdjlaksdjlaksdjlaksdjlaksdj" + "alksdjlkasdjl\n" +
                "kasdjlaksdjlkasjd" + fullName + "lakdjlaksjdlasjdlaksdjlkasdjlkas\n" +
                "jdl" + firstLetter + ";lsdkjfk;sdfj;sd" + firstLetter2;
        System.out.println(metin);

        String not = "not";
        String Not = "Variable isimlerine buyuk harfle baslamak tavsiye edilmez, ama java kabul eder]";
        String nOT = "Bir kere declare ettigim bir tekrar declare edemiyorum";
        String noT = "ama isimler farkli olursa java bunlari farkli degiskenler olarak kabul eder";

        //name convention : degisken isimleri kucuk hafle baslar, sonraki kelimeler bitisik ve buyuk Hafle
        //fullName, firstName, ogrenciAdi, okulNumarasi;
        //camelCase
        //CamelCase classlarda bu sekilde kullaniyoruz


    }

}
