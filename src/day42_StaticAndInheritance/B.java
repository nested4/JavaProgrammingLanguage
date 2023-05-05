package day42_StaticAndInheritance;

public class B {

    public static int s=3;
    public int z=3;
    public int n;
    static {
        System.out.println("static çalıştı");
    }
    {
        System.out.println("Block çalıştı");
    }

    public B(){
        System.out.println("Boş cons çalıştı");
    }

    public B(int n){
        this();
        this.n=n;
        System.out.println("Dolu cons çalıştı");
    }







}
