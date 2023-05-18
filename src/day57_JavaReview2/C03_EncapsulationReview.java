package day57_JavaReview2;

class Employee {
    private String name;
    private double Salary;
    private char gender;

    public Employee(String name, double salary, char gender) {
        setName(name);
        setSalary(salary);
        setGender(gender);
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new RuntimeException("Salary can not be set to zero or a negative number!");
        }
        if (salary <= 10000) {
            throw new RuntimeException("Insufficient Salary for a human being, Employees are NOT your Slaves!");
        }
        Salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')) {
//            return;
            throw new RuntimeException("Invalid Gender, Please enter 'M' or 'm' for Male, 'F' or 'f' for Female");
        }
        this.gender = gender;
    }

    public String getName() {
        if (name == null) {
            throw new RuntimeException("Name has not been set!");
        }
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Name can not be set to NULL!");
        }

        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be Empty!");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                ", gender=" + gender +
                '}';
    }
}


public class C03_EncapsulationReview {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Serka", 23000, 'M'); // default constructor
//        System.out.println("employee1.name = " + employee1.name);
        employee1.setName("Serkan");
        System.out.println("employee1.getName() = " + employee1.getName());

        Employee employee2 = new Employee("Sener", 28000, 'M');
        System.out.println(employee2);
        employee2.setGender('n');
        employee2.setSalary(50000);
        System.out.println(employee2);


    }

}
