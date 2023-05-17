package day53_ExceptionAndCollection_Summary;

public class C01_Exception_Summary {

    public static void main(String[] args) {
     /*   System.out.println(1);
        try {
            System.out.println(2);
            String str=null;
            System.out.println(str.length());
            System.out.println(3);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException ae){
            System.out.println(4);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(5);
        }finally {
            System.out.println(6);
        }
        System.out.println(7);
        /



   try {

   }
   catch (NullPointerException n){

   }catch (SecurityException s){

   }catch (RuntimeException r){

   }catch (Exception e){

   }finally {

   }


   try {

   }finally {
  //chrome.exit;
   }

  */

       c(5,10);





    }

    public static void a() throws InterruptedException {
        Thread.sleep(3000);
    }


    public static void b() throws InterruptedException {
        a();
    }

    public static void d()  {
       try {
           b();
       }catch (Exception e){
           e.printStackTrace();
       }

    }

    public static void c(int x,int y)  {

        if (y-x==5){
            throw new IndexOutOfBoundsException("sonuç 5 olamaz Hata var kardeşim düzelt onu");
        }
    }



}
