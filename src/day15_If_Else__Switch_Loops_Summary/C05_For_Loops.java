package day15_If_Else__Switch_Loops_Summary;

import java.util.Scanner;

public class C05_For_Loops {

    public static void main(String[] args) {
/*
boolean b=true;
     for ( int i=0  ; i<3  ; i++){

            System.out.println(i);
        }
     */
     //kullanıcının 3 hakkı olsun  şifre girsin
        Scanner scan=new Scanner(System.in);
        int sifre=56;

        System.out.println("şifre nedir 3 hakkınız var");
        boolean result=true;
int i=0;
     while( result ){
           System.out.print("Sifre: ");
           int tahmin=scan.nextInt();
           if(sifre==tahmin){
             System.out.println("şifre doğru");
             result=false;
          }else {
             System.out.println("şifre yanlış");
             i++;
            }

        if(i==3){
            result=false;
        }


     }


    }
}
