package day08_ScannerAndOperators;

import java.util.Scanner;

public class C09_AsciiTable {

    public static void main(String[] args) {
        // Kullanicidan bir harf alin ve alfabede o harften bir onceki ve bir sonraki harfleri yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char girilenHarf= scan.next().charAt(0);

        System.out.println("Girilen harf : " + girilenHarf +
                            "\nGirilen harften onceki harf : " +
                            (char)(girilenHarf-1)+
                            "\nGirilen harften sonraki harf : " +
                            (char)(girilenHarf+1));
    }
}
