package day16_Branching_Statements;

import java.util.Scanner;

public class C01_Day_15_Summary {

    public static void main(String[] args) {
/*
        int taban=2;
        int kuvvet=3;

        int result=1;
        for (int i = 0; i <kuvvet ; i++) {
            result*=taban;
        }
        if(taban==0&&kuvvet==0){
            System.out.println("tanımsız");
        }else {
            System.out.println(result);
        }
*/
        //Piramit
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
/*
        for (int i = 5; i>0 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 6-i; k >0 ; k--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        */
//Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2
// sayısının toplamı 25 ise programdan çıkış işlemi gerçekleştirin.
// 25 değil ise program kullanıcıdan iki sayı almaya devam etsin.


        Scanner scan=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Program başladı");
        while(flag){
            System.out.print("x: ");
            int x=scan.nextInt();
            System.out.print("y: ");
            int y=scan.nextInt();
            int result=x+y;
            if (x==0&&y==0){
                break;
            }
            if(result>=25){
                System.out.println("Toplam 25'eşit veya büyük olduğu sonuç veremiyoruz tekrar deneyin");
                continue;

            }
                System.out.println("toplam: "+result);
        }
        System.out.println("Program sonlandı");









    }
}
