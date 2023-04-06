package day12_SwitchCase;

public class C06_Switch_Case {
    public static void main(String[] args) {
        // byte,short,int,String,char tipindeki değerleri karşılaştırmak için kullanılır.

      //  System.out.println("giriş");
        int sayi=3;

        switch (sayi){
            case 1:
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }

       // System.out.println("çıkış");




    }
}
