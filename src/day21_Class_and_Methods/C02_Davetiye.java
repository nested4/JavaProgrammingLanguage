package day21_Class_and_Methods;

import java.util.Scanner;

public class C02_Davetiye {

//Kullanıcıdan
//2 adet kelim e isteyen bir metodunuz olsun Bu metot
//kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
//kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
//kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
//istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
//bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin


    public static void main(String[] args) {
        davetiye();
    }

    public static void davetiye(){
        //boolean flag=true;

        while(true){
            Scanner scan=new Scanner(System.in);
            System.out.print("1.kelime:");
            String kelime1= scan.nextLine();
            System.out.print("2.kelime:");
            String kelime2= scan.nextLine();

                  if(kelimeKontrol(kelime1,kelime2)){
                      System.out.println("kelimeler farklı olmalıydı");
                   // continue; //davetiye();
                  }else {
                      davetiyeYazdir(kelime1,kelime2);
                    return; // flag=false; // break;
                  }

        }

    }

    private static void davetiyeYazdir(String kelime1, String kelime2) {
        System.out.println("********"+kelime1+"*******"+kelime2+"*********");
    }

    private static boolean kelimeKontrol(String str,String str2) {
        return str.equals(str2);
    }


}
