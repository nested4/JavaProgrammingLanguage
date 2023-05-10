package day50_Exception_Collection;

public class C05_Exception_9 {

    public static void main(String[] args) throws Exception {
try {
    throw  new HarunException("Hata");
}catch (HarunException har){
    System.out.println(har.message);
}

    }

    static void d() throws Exception {
    c();

    }



    static void c() throws Exception {
a();
    }

    static void b() throws Exception {
      a();

    }

    static void a() throws Exception {

        Thread.sleep(1000);

    }

}
