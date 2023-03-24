package day19_Custommethods_Return.day20_CustomMethods_Overloading;

public class C04_MethodOverloding2 {


    public static void main(String[] args) {
        calculateArea(5,4);
        calculateArea(3);

    }

    public static void calculateArea(int a ,int b){
        System.out.println(a * b);
    }
    public static void calculateArea(int r){
        System.out.println( Math.round(Math.PI * r * r));
    }


}
