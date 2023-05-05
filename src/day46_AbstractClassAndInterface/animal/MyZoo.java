package day46_AbstractClassAndInterface.animal;

public class MyZoo {
    public static void main(String[] args) {

//        Animal animal = new Animal("asd","asddsd","f",25,"medium","black");
//        Cannot creat objects from abstract classes
        Cat cat = new Cat("Cesur","Scottish",'M',9,"Medium","Gray");
        cat.eat();
        cat.meow();
        cat.play();
        cat.setAge(0);
        System.out.println(cat);
        cat.setSize("Large");
        cat.setName("Tufan");
        System.out.println(cat);

    }
}
