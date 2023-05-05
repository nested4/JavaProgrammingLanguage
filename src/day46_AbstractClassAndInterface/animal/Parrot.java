package day46_AbstractClassAndInterface.animal;

public class Parrot extends Animal implements CanFly,Playable {
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

    }

    public void eat() {
        System.out.println(getName() + " is eating sunflower seeds");

    }

    public void fly(){
        System.out.println(getName()+" flies slower than eagle");
    }

    public void play(){
        System.out.println(getName()+" is playing with cats");
    }


}
