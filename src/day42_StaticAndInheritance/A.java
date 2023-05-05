package day42_StaticAndInheritance;

public class A {
    public static String staticVariable="Harun";
    public  String normalVariable;


    public static void staticMethod(){
       // normalMethod();
      //  System.out.println(normalVariable);
      //  System.out.println(staticVariable);
      //  staticMethod();
        System.out.println("ben bir static metodum");
    }

    public void normalMethod(){
        System.out.println(normalVariable);
        staticMethod();
        System.out.println(staticVariable);
        System.out.println("ben bir normal metodum");
    }




}
