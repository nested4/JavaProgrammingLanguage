package day40_Encapsulation;

public class C02_PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
//        person1.name="Osman"
        System.out.println("person1.getAge() = " + person1.getAge());
        person1.setName("Fuat");
        person1.setAge(41);

        System.out.println("person1.getName() = " + person1.getName());
        System.out.println("person1.getAge() = " + person1.getAge());

        Person person2 = new Person();
        person2.setAge(-10);
        person2.setName("Elif");
        System.out.println("person2.getName() = " + person2.getName());
        System.out.println("person2.getAge() = " + person2.getAge());


    }
}
