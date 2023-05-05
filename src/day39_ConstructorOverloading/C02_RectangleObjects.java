package day39_ConstructorOverloading;

public class C02_RectangleObjects {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(6.5, 4.2);
        System.out.println("rectangle1.calculatePerimeter() = " + rectangle1.calculatePerimeter());
        rectangle1.length=7.8;
        System.out.println(rectangle1);



    }
}
