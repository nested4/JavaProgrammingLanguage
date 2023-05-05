package day39_ConstructorOverloading;

public class C01_StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Mehmet",25,'M',95,123456);
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.id = " + student1.id);
        student1.name="Osman";
        System.out.println("student1.name = " + student1.name);

        System.out.println(student1);

    }
}
