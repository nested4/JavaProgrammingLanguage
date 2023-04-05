package day28_QuizAnswers;

import java.util.Scanner;

public class C06_CondingAnswers3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Kelime Bir de harf giriniz");
        String str=scan.nextLine();
        String ch=scan.nextLine();
        System.out.println(str+"‘da "+frequency(str,ch)+" adet "+ch+" bulunmaktadir.");
    }

   public static int frequency(String str,String ch){
       return str.length()-str.replace(ch,"").length();
   }
}
/* Kullanicidan bir String bir de char deger alin. Stringin icinde kac tane char
oldugunu donen bir metodla sayiyi hesaplatin. Stringde kac adet o harften
oldugunu da asagidaki formatta ekrana yazdirin. İpucu: length(),
frequency(String str,char ch)
orn:input “Merhaba”, ‘a’ Output= Merhaba ‘da 2   a bulunmaktadir.*/