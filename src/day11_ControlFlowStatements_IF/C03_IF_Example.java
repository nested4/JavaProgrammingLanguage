package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {

    // alinin fizik notu 50
    // kimya 30 ortalaması 50 üzerinde ise
    // ekrana geçti yazsın
    // 50 ve altında ise herhangi bir şey yazdırmasın
    public static void main(String[] args) {
    /*    double f=50;
        double k=55;
      double ort=(f+k)/2;
       double gecmeNotu=50;
       if(ort>gecmeNotu){
            System.out.println("Ali geçti");
        }

        /
     */
        // alinin fizik notu 50
        // kimya 30 ortalaması 50 üzerinde ise
        // ekrana geçti yazsın
        // 50 ve altında ise herhangi bir şey yazdırmasın

        Scanner scan=new Scanner(System.in);
        System.out.println("Ders notlarını giriniz");
        System.out.print("Fizik: ");
        double f= scan.nextDouble();
        System.out.print("Kimya: ");
        double k= scan.nextDouble();
        System.out.print("Matematik: ");
        double m= scan.nextDouble();
        System.out.print("Geçme notu: ");
        double gecmeNotu= scan.nextDouble();

        double ort=(f+k+m)/3;
        if (ort>=gecmeNotu){
            System.out.println("Sınıfı geçtiniz tebrikler");
        }else {
            System.out.println("Kaldınız");
        }





    }



}
