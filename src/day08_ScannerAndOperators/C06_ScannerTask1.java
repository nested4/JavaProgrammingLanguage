package day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin
        //Sayinin karesini alin konsola yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");

        int girilenSayi = scan.nextInt();

        System.out.println("Girilen sayi = "+girilenSayi);
        System.out.println("Girilen sayinin karesi = "+girilenSayi*girilenSayi);

        scan.close();





    }
}
