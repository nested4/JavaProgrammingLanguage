package day21_Class_and_Methods;

import java.util.Scanner;

public class C04_Methods_Last_Question {
    //Konsoldan
    //kullanıcıdan 2 sayı almanızı sağlayan bir
    //metodu çağırı n İkinci sayı 3 ün katı olan bir sayı değilse,
    //başka bir metodtan geçirin ve 3 katı olacak ş ekilde size
    //döndürsün Sonra bu sayıları kabul eden başka bir
    //metotla da sayıları toplayın

    public static void main(String[] args) {
        System.out.println(sayiAl());
    }

    public static int sayiAl(){
        Scanner scan=new Scanner(System.in);
        System.out.print("1.Sayi: ");
        int sayi1= scan.nextInt();
        System.out.print("2.Sayi: ");
        int sayi2= scan.nextInt();
          return sayilariTopla(sayi1 ,ucunkati(sayi2));
    }

    private static int sayilariTopla(int x, int y) {
      return (x+y);
    }

    private static int ucunkati(int sayi2) {
        if(sayi2%3==0){
            return sayi2;
        }
        return sayi2-sayi2%3;
    }


}
