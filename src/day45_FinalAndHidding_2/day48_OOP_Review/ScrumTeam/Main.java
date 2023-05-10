package day45_FinalAndHidding_2.day48_OOP_Review.ScrumTeam;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ahmet", 30, 'm');
        System.out.println(person);
        Employee employee = new Employee("Ahmet", 30, 'M', "Developer", 32000, 123456, "IT");

        System.out.println(employee.age);
        System.out.println(employee.departmentName);
        //        employee.getSalary()   //TOPSECRET

        Employee employee1 = new Employee("Ayse", 32, 'F', "Developer", 33000, 123457, "IT");
        System.out.println(employee1.getId());

        employee1.work();
        employee1.eat("Cake");


    }
}
