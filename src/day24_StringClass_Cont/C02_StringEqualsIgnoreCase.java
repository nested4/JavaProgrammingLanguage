package day24_StringClass_Cont;

public class C02_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 ="Merhaba";
        String s2="MERHAba";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
