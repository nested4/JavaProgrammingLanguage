package day49_Exception;

import java.util.Scanner;

public class C02_Exception_2 {




    public static void main(String[] args) {
/*
        System.out.println("kod başladı");
        try {
            System.out.println(5/0);

        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        System.out.println("kod devam ediyor");

        */
        //faktoriyel hesabı yapan bir metod yazınız...


       // System.out.println(faktoriyel(10));
/*
        System.out.println("0");
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");
        }catch (Exception e){
            System.out.println("6");
            try {
                System.out.println(5/0);
            }catch (Exception f){
                System.out.println("7");
            }

        }

        System.out.println("8");

//while ve for looplar kullanmadan kullanıcıya 3 hak verin ve int değeri doğru girmez
// ise kullanıcıya ikaz vererek programdan atın

*/


        System.out.println(sayiGiris());


    }


    private static int count=0; //sayigiris metodu için kullanılmıştır. Nasıl bulmak istiyorsan öyle bırak.
    public static int sayiGiris(){
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.print("sayi: ");
            int x=scanner.nextInt();
            count=0;
            return x;
        }catch (Exception e){
            count++;
            if (count==3){
                System.out.println("hakkınız kalmamıştır");
                count=0;
                System.exit(0);
            }
            System.out.println(3-count+" hakkınız kalmıştır, lütfen tekrar deneyiniz");
            return sayiGiris();
        }


    }




    public  static int faktoriyel(int n){

        try {
            int result=1;
            for (int i = 1; i <=n ; i++) {
                result*=i;
            }
            return result;
        }catch (Exception e){
            System.out.println("hata:"+e.toString());
            return -1;
        }


    }


}
