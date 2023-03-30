package day24_StringClass_Cont;

public class C03_StringIsEmpty {
    //isEmpty() Stringin bos olup olmadigini kontrol ediyor
    public static void main(String[] args) {

        String s1 = "Merhaba";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        String s2="";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        String s3=" ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
    }
}
