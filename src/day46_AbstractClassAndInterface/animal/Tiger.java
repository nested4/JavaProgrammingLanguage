package day46_AbstractClassAndInterface.animal;

public final class Tiger extends Animal implements Wild{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println(getName()+" is eating deer");
    }

    public void hunt(){
        System.out.println(getName()+" hunts a deer");
    }

}
