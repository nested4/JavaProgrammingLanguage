package day47_Polymorphism;

import day46_AbstractClassAndInterface.animal.Animal;
import day46_AbstractClassAndInterface.animal.Cat;
import day46_AbstractClassAndInterface.animal.Dog;
import day47_Polymorphism.shape.Circle;
import day47_Polymorphism.shape.Shape;

import java.util.Arrays;

public class C01_Polymorphism {
    public static void main(String[] args) {

        Animal animal = new Dog("Panco","Golden",'M',9,"Medium","Yellow");
        Dog dog = new Dog("Lucky","Husky",'M',9,"Medium","Brown");

        boolean isAnimal = animal instanceof Animal;
        boolean isDog = animal instanceof Dog;
        boolean isCat = animal instanceof Cat;
        System.out.println(isAnimal);
        System.out.println(isDog);
        System.out.println(isCat);

        animal.eat();
        animal.drink();
//        animal.bark() // Referance type Animal
        System.out.println("------------------");

        ((Dog)(animal)).bark(); // Explicit casting
        ((Dog)(animal)).play();
        System.out.println("------------------");

        animal = new Cat("Panco","Golden",'M',9,"Medium","Yellow");
        ((Cat) animal).meow();

        Cat cat = new Cat("Max","Van",'f',9,"Medium","White");
//        cat= new Dog("Panco","Golden",'M',9,"Medium","Yellow");
        Animal animal1= cat;
        System.out.println(animal1);
        animal1.eat();
        animal1.drink();

        animal1= dog;
        System.out.println(animal1);


        /*
        * WebDriver driver;
        * driver= new ChromeDriver()
        * driver.get(amazon)
        *
        * driver= new FireFoxDriver();
        * driver.get(google)
        * */
        Circle circle = new Circle(5);
        circle.setRadius(9);
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle);

        Shape shape = new Circle(6);
        System.out.println(shape.perimeter());
        shape.area();
        System.out.println(shape.getName());
        System.out.println(shape);

        System.out.println(shape.getClass());
        System.out.println(shape.getClass().getName());

        System.out.println("---------------------------------------------------");

        String str= "Golden globe";
        int a=3;
        Double b= 12.5;

        Object[] objectArray = {str,a,b,shape,animal1,cat};

        System.out.println(Arrays.toString(objectArray));


    }
}
