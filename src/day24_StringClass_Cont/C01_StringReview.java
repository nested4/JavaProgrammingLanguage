package day24_StringClass_Cont;

import java.util.Scanner;

public class C01_StringReview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim=scan.nextLine();

        //0123456789012
        // Yavuz Selim
        //ismin son harfini al
        //length(), charAt()
        int uzunluk=isim.length();
        char sonHarf = isim.charAt(uzunluk-1); // Toplam karakter saysindan 1 cikarip son indeksi buluyorum
        System.out.println(sonHarf);

        //equals()

        System.out.println(isim == " Yavuz Selim ");      // false  farkli objeleri isaret ediyorlar
        System.out.println(isim.equals(" Yavuz Selim ")); // true
        System.out.println(isim.equalsIgnoreCase(" yaVuz seliM "));

        //toUpperCase toLowerCase
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        System.out.println(isim);

        //trim()
        System.out.println(isim.trim());
        System.out.println(isim);

        //indexOf()
        System.out.println(isim.indexOf("S"));
        System.out.println(isim.indexOf("Selim"));
        System.out.println(isim.indexOf(" "));
        System.out.println(isim.lastIndexOf(" "));
        int ilkIndeks= isim.indexOf(" ");
        int lastIndeks= isim.lastIndexOf(" ");
        if(ilkIndeks==lastIndeks){
            System.out.println("Stringde uniquetir");
        }else{
            System.out.println("Unique degildir");
        }

        //replace()
        System.out.println(isim.replace(" ", ""));
        System.out.println(isim.replace("vuz", "giz"));
        String message= "Merhaba";    //
        String message1= "Merhaba";   // message message1 ayni objeleri isaret ediyor, String pool icinde
        String message2= new String("Merhaba");
        System.out.println(message==message1);
        System.out.println(message==message2);

        System.out.println(message);
        System.out.println(message.replace('a','e'));
        System.out.println(message.replaceFirst("a", "e"));


    }
}
