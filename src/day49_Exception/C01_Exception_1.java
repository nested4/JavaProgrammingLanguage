package day49_Exception;

import java.util.Scanner;

public class C01_Exception_1 {

    public static void main(String[] args) {
/*
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        try {
            int x= scan.nextInt();
            System.out.println(x*10);
        }catch (Exception e){
            System.out.println("Hata alındı");
        }

        System.out.println("Kod devam ediyor.....");
        System.out.println("Kod devam ediyor.....");
        System.out.println("Kod devam ediyor.....");

        */

      //  System.out.println(bolme(5,0));

/*
        String[] arr={"Harun","Mehmet","Ahmet"};
        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("Hata:"+e.getMessage());
        }
        System.out.println("kod devam ediyor");

*/

        //System.out.println(sayiGir());
        Scanner scan=new Scanner(System.in);
        System.out.println("Kod başladı");

        try {
            int x=5/0;
        }catch (Exception e){
            System.out.println("Hata: "+e.getMessage());
            System.out.println("Kararınız nedir?(1 işleme devam, 2 programı sonlandır)");
            int karar=scan.nextInt();
            if(karar!=1){
                System.exit(0);
            }
        }

        System.out.println("Kod devam ediyor");








    }



    public  static int bolme(int sayi,int bolen){
       try {
           return sayi/bolen;
       }catch (Exception e){
           System.out.println(e.toString());
           return -1;
       }


    }


    public  static int sayiGir(){


        try {
            Scanner scan=new Scanner(System.in);
            System.out.print("sayi:");
            int sayi;
            sayi= scan.nextInt();
          return sayi;




        }catch (Exception e){

            System.out.println("Hatalı giriş tekrar deneyiniz");
          return sayiGir();
        }
    }


}
