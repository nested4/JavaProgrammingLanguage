package day10_UnaryLogicalOperAndReview;

public class C04_UnaryOperators {
    public static void main(String[] args) {
        //+,-,++,--
        int num1= +3;
        int num2 = -2;

        System.out.println(num1>0); //true
        System.out.println(num2>0); //false

        System.out.println("--------------------------------");


        int a = 10;
        ++a; // pre increment : sayinin degerini hemen bir artiriyor //a=11
        System.out.println(a); //11

        --a; //pre decrement : sayinin degerini hemen bir azaltir  //10
        System.out.println(a); //10

        System.out.println("--------------------------------");

        int b = 99;

        System.out.println(++b); // pre increment //100

        int c = 99;
        System.out.println(c++);   // post increment c'yi consola 99 -->  c=100;
        System.out.println(c); //100

        System.out.println("--------------------------------");

        int x= 201;

        System.out.println(--x); //pre decrement 200

        int y = 201;

        System.out.println(y--);  //post decrement consola=>201  y=200
        System.out.println(y); //200

        System.out.println("--------------------------------");

        int z = 44;

        System.out.println(++z);  //45 z=45
        System.out.println(z++);  //45 z=46
        System.out.println(z++);  //46 z=47

        int i = 42;
        System.out.println(--i);  //41 i=41
        System.out.println(i--);  //41 i=40
        System.out.println(i);    //40








    }
}
