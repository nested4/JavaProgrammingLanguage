package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {

    public static void main(String[] args) {
        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //		Isminiz : Himmet
        //		Soyisminiz : Abi
        //		Yasiniz : 38
        //      Dogum Yeriniz : Kayseri
        //		Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lutfen isminizi giriniz");

        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dogum yerinizi giriniz");
        String dogumYeri = scanner.nextLine();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Dogum Yeriniz : " + dogumYeri);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

// Kullanicinin istedigimiz veri titurunde deger girisi yapmazsa
// kodumuzda hata olusur, execution durur
// hatali inputlara karsi nasil tedbirler alacagimizi daha sonra gorucez
// Simdi kullanici bizim talimatlarimizi kabul ediyopr ve dogru input giriyor varsayiyoruz
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Isminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas +
                "\nDogum Yeriniz : " + dogumYeri +
                "\nKaydiniz basariyla tamamlanmistir.");

        scanner.close();


    }
}
