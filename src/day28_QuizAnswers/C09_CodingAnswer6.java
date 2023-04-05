package day28_QuizAnswers;

public class C09_CodingAnswer6 {
    public static void main(String[] args) {
        System.out.println("isPalindrome(\"racecar\") = " + isPalindrome("racecar"));
    }


    public static boolean isPalindrome(String str){
        String reverse="";

        for (int i=str.length()-1;0<=i;i--){
            reverse+=str.charAt(i);
        }
         return str.equals(reverse) ? true : false;
     }

}
/*Girilen kelimenin polindrom olup olmadığını kontrol eden bir metot yazınız.
(Tersi kendisine eşit)*/
