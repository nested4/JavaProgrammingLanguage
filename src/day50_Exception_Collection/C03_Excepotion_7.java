package day50_Exception_Collection;

public class C03_Excepotion_7 {
    public static void main(String[] args)  {
        System.out.println(5/0);
        b();
    }

    static void b()  {
        try {
            a();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    static void a() throws InterruptedException {
      Thread.sleep(3000);
    }
}
