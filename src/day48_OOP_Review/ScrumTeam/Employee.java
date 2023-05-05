package day48_OOP_Review.ScrumTeam;

public class Employee extends Person {
    public String jobTitle;

    private double salary;

    private int id;

    public String departmentName;

    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, String departmentName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        setSalary(salary);
        setId(id);
        this.departmentName = departmentName;
    }

//    public double getSalary() {   TOPSECRET
//        return salary;
//    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Invalid Salary");
        } else {
            this.salary = salary;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + "" + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                "} " + super.toString();
    }


}
