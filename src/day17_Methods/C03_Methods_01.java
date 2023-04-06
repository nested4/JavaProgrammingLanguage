package day17_Methods;

public class C03_Methods_01 {


    public static void main(String[] args) {
 message_2();
    }

    public static void message_1(){
        message_3();
        System.out.println("1");
    }
    public static void message_2(){
        message_1();
        System.out.println("2");
    }
    public static void message_3(){
        System.out.println("3");

    }
   /* public static void menu(){
        hello();
        System.out.println("1:Para çekme 2:Para yatırma 3:bakiye görüntüle 4:çıkış");
    }

    public static void hello(){
        System.out.println("Bankamıza hoş geldiniz");

        //menü
    }

*/



}
