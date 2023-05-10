package day49_Exception;

public class C04_Exception_4 {




    public static void a(){
      b();

    }

    public static void b(){
        try {
            d();
        }catch (Exception e){

        }


    }

    public static void c() throws InterruptedException {
       d();
    }

    public static void d() throws InterruptedException {

       Thread.sleep(3000);

    }



}
