package day24_StringClass_Cont;

public class C04_StartsWith_EndsWith {
    public static void main(String[] args) {
        String str ="Java is cool";
        System.out.println(str.startsWith("J")); //true
        System.out.println(str.startsWith("Ja")); //true
        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.startsWith("java")); //false
        System.out.println(str.startsWith("Java is cool"));//true
        System.out.println(str.startsWith(str)); //true
        System.out.println(str.startsWith("")); //true
        System.out.println(str.startsWith(" ")); //false

        System.out.println("-------------------------------------");
        System.out.println(str.endsWith("l"));//true
        System.out.println(str.endsWith("ol"));//true
        System.out.println(str.endsWith("ool"));//true
        System.out.println(str.endsWith("cool"));//true
        System.out.println(str.endsWith(str));//true



    }
}
