package day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {

        // Bilgisayarın tuttuğu 0 dahil-50 arası
        // sayısıyı 5 hamlede bulma
        // tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
        //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı

        Random random=new Random();
        int sayi= random.nextInt(50);

        //5 yukarı
        // 30 aşağı
        // tebrikler
        //malesefe bilemedin tuttuğum sayı 28
        Scanner scan=new Scanner(System.in);
        int i=1;
        while(i<=5){
            System.out.print(i+".Tahmin: ");
            int tahmin= scan.nextInt();
            if(tahmin>sayi && i!=5){
                System.out.println("Aşağı");
            }else if(tahmin<sayi && i!=5){
                System.out.println("Yukarı");
            }else if(tahmin==sayi) {
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if(i==6){
                System.out.println("malesef bilemedin tuttuğum sayı: "+sayi);

            }




        }





    }








}
