package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_If {

    public static void main(String[] args) {

        // Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını
        //sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzerinde ise yanında bayan olup olmadığını sorun
        // bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğiniz sorun
        //yüzme bilmiyor ise yine giriş yapamasın

        Scanner scan=new Scanner(System.in);
        System.out.print("yaşınız: ");
        int yas=scan.nextInt();

        if(yas>=18){

            System.out.print("Yanınızda bayan var mı Evet/Hayır: ");
            String yanit= scan.next();
            if(yanit.equals("Evet")){
                  System.out.print("Yüzme biliyormusunuz Evet/Hayır: ");
                   String yanit2= scan.next();
                  if(yanit2.equals("Evet")){
                      System.out.println("hoş geldiniz");
                  }else{
                      System.out.println("Yüzme bilmeyenler giriş yapamaz");
                  }

            }else {
                System.out.println("yanınızda bayan olmadığı için giremezsiniz");
            }

        }else {
            System.out.println("Giremezsiniz");
        }



    }
}
