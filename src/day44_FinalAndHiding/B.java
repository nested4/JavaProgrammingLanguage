package day44_FinalAndHiding;

public class B extends A {

    int b=10;
    {
        System.out.println("B ınstance metodu çalıştı");
    }
    static {
        System.out.println("B static ınstance metodu çalıştı");
    }

    public B(){
        System.out.println("B consturctor'ı çalıştı");
    }

}
