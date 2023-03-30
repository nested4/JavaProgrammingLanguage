package day24_StringClass_Cont;

public class C07_ReverseString {
    public static void main(String[] args) {
        String str = "EY EDIP PIDE YE";
        String reversed="";

        for (int i=str.length()-1;0<=i;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reversed);

    }
}
