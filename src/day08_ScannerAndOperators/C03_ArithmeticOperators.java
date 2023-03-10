package day08_ScannerAndOperators;

public class C03_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("90" + 10);  //9010, concatenation
        System.out.println(10 + "20");  //1020, concatenation
        System.out.println("90" + 10 + 10); //901010, concatenation
        System.out.println("90" + (10 + 10)); //9020, concatenation
        System.out.println(10 + "90" + 30); //109030, concatenation
        System.out.println(10 + 30 + "90"); //4090, concatenation
        System.out.println("" + 10 + 30 + "90"); //103090, concatenation *

        System.out.println("---------------------------------");
        System.out.println(10 + 20);// 30, Addition
        System.out.println(100 - 20); //80 subtraction
        System.out.println(10 + 6);   //60 multiplication

        System.out.println("---------------------------------");

        System.out.println(100 / 3);//33
        System.out.println(10 / 4); //2
        System.out.println(10 / 4.0);
        System.out.println(10.0 / 4);
        System.out.println(10d / 4);

        System.out.println("---------------------------------");

        int a = 100;
        double b = a / 6;  //
        double c = 16;
        System.out.println(b);
        System.out.println(c);

        double d = (double) a / 6;
        System.out.println(d);

        System.out.println(100);
        System.out.println(100d);

        System.out.println("---------------------------------");

        System.out.println(10 % 2);
        System.out.println(10 % 3);
        System.out.println(10 % 4);


    }
}
