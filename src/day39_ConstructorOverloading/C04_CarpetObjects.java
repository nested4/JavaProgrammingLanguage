package day39_ConstructorOverloading;

public class C04_CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(1.9, 2.9);
        System.out.println("carpet1.calcPrice() = " + carpet1.calcPrice());
        Carpet carpet2 = new Carpet(3.5,5,500,true);
        System.out.println("carpet2.calcPrice() = " + carpet2.calcPrice());
//        Carpet.calcPrice() // Cant call the method with classname since static
        System.out.println(carpet2);

    }
}

