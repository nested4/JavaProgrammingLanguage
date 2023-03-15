package day13_ForLoops;

import java.util.Scanner;

public class C02_If_Switch_Ternary {
    public static void main(String[] args) {
        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/

//        String name="ihsan";
//        System.out.println(name);
//        System.out.println(name.charAt(0));

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);   //scanner sinifi ile harf alamiyoruz, scan.next() String aldik
        //charAt(0) bu aldigiminiz kelimenin ilk harfini almis olduk

        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazar, Pazartesi, Persembe");
        } else if (harf == 's' || harf == 'S') {
            System.out.println("Sali");
        } else if (harf == 'c' || harf == 'C') {
            System.out.println("Carsamba, Cuma, Cumartesi");
        } else {
            System.out.println("Gecersiz harf");
        }

        System.out.println("---------------------------------------------------------------");

        switch (harf){
            case 'p','P':
                System.out.println("Pazar, Pazartesi, Persembe");
                break;
            case 's','S':
                System.out.println("Sali");
                break;
            case 'c':
            case 'C':
                System.out.println("Carsambe, Cuma, Cumartesi");
                break;
            default:
                System.out.println("Gecersiz Harf");

        }
        System.out.println("---------------------------------------------------------------");
        //  ternary
        //  (condition) ? (return if true) : (return if false);
        //  (condition) ? (return if true) : (new ternary);
        String result = (harf == 'p' || harf == 'P') ? "Pazar, Pazartesi, Persembe" : (harf == 's' || harf == 'S')? "Sali"
                : (harf == 'c' || harf == 'C')?("Carsamba, Cuma, Cumartesi"):"Gecersiz Harf";
        System.out.println(result);
    }
}
