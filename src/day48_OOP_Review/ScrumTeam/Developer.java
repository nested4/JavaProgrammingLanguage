package day48_OOP_Review.ScrumTeam;

public class Developer extends Employee implements DevTeam {
    public String programmingLanguage;

    public Developer(String name, int age, char gender, double salary, int id, String departmentName, String programmingLanguage) {
        super(name, age, gender, "Developer", salary, id, departmentName);
        this.programmingLanguage = programmingLanguage;
    }

    public void fixBug() {
        System.out.println(jobTitle + " " + name + " is fixing Bugs");
    }

    public void coding() {
        System.out.println(jobTitle + " " + name + " is programming " + programmingLanguage);
    }

}
