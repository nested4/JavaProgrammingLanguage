package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //1. adim Scanner objesi olusturalim
        Scanner scan = new Scanner(System.in);

        //2. Kullaciyi bilgilendir! Ne istediginizi soyleyin
        System.out.println("Lutfen isminizi giriniz");

        //3.Girilen bilgiyi icine koyabilecegiz uygun data tipinde variable/degisken olusturun
        //olusturdugumuz degiskenin icesine, scanner objesi ile uygun methodu cagirarak veriyi alin

        String name= scan.nextLine();

        System.out.println("Girilen isim : "+name);

        scan.close();






    }
}
