package day17_Methods;

import java.util.Scanner;

public class C04_Methods_02 {

   //f(x)=2x+3

    /**
     * a method prints the average to the console
     */
    public static void aritmetikOrtalama(){

        double x=3,y=5,z=10;
        double result=(x+y+z)/3;
        System.out.println("ortalama: "+result);

    }
//Bir method yazın 2 sayıdan büyük olanı versin

    /**
     * a method that returns the max of the number
     */
   public static void enBuyuk(){
        int x=10,y=20;
        int max;
        if(x>y){
            max=x;
        }else {
            max=y;
        }
       System.out.println("En Büyük sayı: "+max);
   }
//Bir method yazın ve kiloyu okka cinsinden versin. Okka=1.282 kg


    /**
     * a method converts kilo to okka
     */
    public static void kiloOkkaCevir(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kilogram: ");
        double kilogram= scan.nextDouble();
        double okka=kilogram/1.282;
        System.out.println(kilogram+" kilogram "+okka+" okkadır");
    }




    //f(x)=x*x*x
    public static void kupHesapla(int x){
        int result=x*x*x;
        System.out.println("sonuç: "+result);

    }
    // 1 sayının karesini yazan metodu yazınız
public static void  kareHesapla(int x){
        int result=x*x;
    System.out.println(result);
}



    // parametre olarak isminizi alan ve sonucunda isminiz.... yazan programı yazınız

    public static void isimYaz(String name){
        System.out.println("İsminiz:"+name);
    }



    public static void max(int x,int y){
        int max;
        if(x>y){
            max=x;
        }else {
            max=y;
        }
        System.out.println("En Büyük sayı: "+max);
    }



    //f(x,y)=x*y*x*x+y

//iki sayının ortalamasını veren metodu yazınız

public static void ortalamaHesapla2(double x,int y){
        double ortalama=(x+y)/2;

    System.out.println(ortalama);
}
 public static void ortalamaHesapla3(double x,int y,int z){
        double ortalama=(x+y+z)/3;

        System.out.println(ortalama);
    }

    public static void main(String[] args) {
        // isimYaz("Mehmet");
       // kiloOkkaCevir();
        ortalamaHesapla3(10.0,5,3);
      //  isimYas("harun",25);

    }

    public static void isimYas(String isim ,int yas){

        System.out.println(isim+" "+yas+" ındadır");

    }


}
