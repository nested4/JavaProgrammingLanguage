package day24_StringClass_Cont;

public class C05_Substring {
    public static void main(String[] args) {
        String str="Java Programming Language";
        //          0123456789012345678901234

        //substring metodu iki sekilde kullanilabilir
        //Tek parametreli, o indeksten baslar sonuna kadar kismi alir

        System.out.println(str.substring(5)); //Programming Language
        System.out.println(str.substring(0)); //Java Programming Language
        System.out.println(str.substring(17));//Language
        System.out.println(str.substring(str.length()));//emptyIndex, Hiclik ""
        System.out.println(str.substring(str.length()-3)); //age
        System.out.println(str.substring(str.length()-8)); //Language

        //substring(beginningIndex,endingIndex)  endingIndex dahildegil
        System.out.println(str.substring(2, 4));  //va
        System.out.println(str.substring(5, 16)); //Programming
        System.out.println(str.substring(0, 1));  //J
        System.out.println(str.substring(str.length() - 1, str.length()));
        System.out.println(str.substring(5, 5));  //""
        System.out.println(str.substring(0, 0));  //""
        System.out.println(str.substring(4, 5));  //" "
        // System.out.println(str.substring(5, 3));  //Runtime Error; StringIndexOutOfBoundException


    }
}
