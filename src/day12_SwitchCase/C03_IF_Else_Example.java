package day12_SwitchCase;

import java.util.Scanner;

public class C03_IF_Else_Example {
    public static void main(String[] args) {
        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

        Scanner scan=new Scanner(System.in);

        System.out.print("Sayi 1: ");
        double x= scan.nextDouble();
        System.out.print("Sayi 2: ");
        double y= scan.nextDouble();
        System.out.print("lütfen işlem seçiniz (+,-,*,/): ");
        String islem=scan.next();

      //  double sonuc=0;

        if(islem.equals("+")){
            System.out.println(x+y);
        }else if(islem.equals("-")){
            System.out.println(x-y);
        }else if(islem.equals("*")){
            System.out.println(x*y);
        }else if(islem.equals("/")){
            System.out.println(x/y);
        }else {
            System.out.println("hatalı işlem");
        }

    }
}
