package day49_Exception;

public class C03_Exception_3 {


    public static void main(String[] args) {

        System.out.println(metot(null));
String [] arr={"harun"};
        System.out.println(arr[2]); //ArrayIndexOutOfBoundsException
    }

    public  static  void unchecked(){
            System.out.println(5/0);  //aritmeticException

    }

    public static String metot(String str){
        try {
            String result="";
            for (int i =str.length()-3; i <str.length() ; i++) {     //NullPointerException
                result+=str.charAt(i);
            }
            return result;
        }catch (Exception e){
            return null;
        }


    }





    public static void check() throws InterruptedException {

            Thread.sleep(3000);  //InterruptedException


    }
}
