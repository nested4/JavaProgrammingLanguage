package day44_FinalAndHiding;

public class C extends B{
    int c=5;

    {

        System.out.println("c ınstance metodu çalıştı");

    }
    static {
        System.out.println("C static ınstance metodu çalıştı");
    }

    public C(){

        System.out.println("C consturctor'ı çalıştı");
    }


}
