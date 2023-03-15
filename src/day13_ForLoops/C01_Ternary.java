package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz: ");
        int num= scan.nextInt();

        if(num%2==0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek Sayi");
        }

        System.out.println("---------------------------------");

        System.out.println(num%2==0? "Cift Sayi":"Tek Sayi");

        System.out.println("---------------------------------");

        String result = (num%2==0) ? "Cift Sayi" : "Tek Sayi";
        System.out.println(result);

        //(condition) ? (return if true) : (return if false);

    }
}
