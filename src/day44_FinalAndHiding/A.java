package day44_FinalAndHiding;

public class A {

    int a=20;

    static {
        System.out.println("A static ınstance metodu çalıştı");
    }
    {
        System.out.println("A ınstance metodu çalıştı");
    }
    {
        System.out.println("A ınstance metodu çalıştı");
    }
    public A(){
        System.out.println("A consturctor'ı çalıştı");
    }


}
