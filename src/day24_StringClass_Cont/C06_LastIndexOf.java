package day24_StringClass_Cont;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        //indexOf() ilk bulunanin indeksini getiriyor,
        //lastIndexOf() son bulunanin ideksini getiriyor
        //           0123456
        String str= "Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));

        System.out.println("---------------------------------");
        int length=str.length();    //Merhaba  7
        System.out.println(length);
        str=str.replace("a","");  //Merhb  5
        int lengthFinal=str.length();  //5
        System.out.println("Merhaba icerisinde a "+(length-lengthFinal)+" adet mevcuttur.");
    }
}
