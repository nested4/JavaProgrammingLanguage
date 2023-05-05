package day40_Encapsulation;

public class C01_EmployeeObjects {
    public static void main(String[] args) {
       Employee employee1= new Employee("",'P',20,32000);

       // System.out.println("employee1.age = " + employee1.age);
       // employee1.age=22;
        // employee1.name;  // get methodu olsada ancak metodla degiskene erisebiliriz
        System.out.println("employee1.getName() = " + employee1.getName());
        // Private degisken oldugu icin data esimimiz yok
        System.out.println("employee1.getGender() = " + employee1.getGender());
        //employee1.gender;
        System.out.println(employee1);

        Employee employee2= new Employee("umit",'A',-20,25000);
        System.out.println(employee2);
        employee2.setGender('M');
        employee2.setAge(38);
        employee2.setSalary(33000);
        System.out.println(employee2);

        Employee employee3= new Employee("",'A',-20,-25000);
        System.out.println(employee3);
    }

}
