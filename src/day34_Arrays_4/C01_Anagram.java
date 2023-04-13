package day34_Arrays_4;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki Kelime Giriniz");
        String str1= scan.nextLine();
        String str2= scan.nextLine();

        if(isAnagram(str1,str2)){
            System.out.println(str1+" ile "+str2+" anagramdir. ");
        }else {
            System.out.println(str1+" ile "+str2+" anagram degildir. ");

        }
    }

    public static boolean isAnagram(String str1, String str2) {

        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
//        System.out.println(Arrays.toString(chArr1));
//        System.out.println(Arrays.toString(chArr2));

        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        return Arrays.equals(chArr1,chArr2);
    }
}
// write a method that can check if str1 & str2 are build out same characters ANAGRAM
// kil  ilk
// adam dama
