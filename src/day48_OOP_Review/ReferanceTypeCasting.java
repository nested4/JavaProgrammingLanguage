package day48_OOP_Review;

import day46_AbstractClassAndInterface.animal.Animal;
import day46_AbstractClassAndInterface.animal.Dog;
import day47_Polymorphism.shape.*;

public class ReferanceTypeCasting {
    public static void main(String[] args) {


        //Shape shape= new Shape() // Abstract

        Shape shape = new Circle(5);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        System.out.println(shape);

//        Animal animal = new Animal()  //Abstract
        Animal animal = new Dog("Karabas", "Aksaray Malaklisi", 'M', 5, "XLarge", "Beyaz");

        animal.drink();
        animal.eat();
        ((Dog) (animal)).bark();
        ((Dog) (animal)).play();

        Shape shape1 = new Square(10);
        System.out.println("shape1.perimeter() = " + shape1.perimeter());
        System.out.println("shape1.area() = " + shape1.area());
        System.out.println("shape1.getName() = " + shape1.getName());

        System.out.println("((Square)(shape1)).getSide() = " + ((Square) (shape1)).getSide());

        Cube cube = new Cube(5);
        cube.setSide(6);
        System.out.println(cube);

//        cube= shape1;
        shape1 = cube;
        shape1 = shape;
        shape1 = new Triange(3, 4, 5);


    }
}
