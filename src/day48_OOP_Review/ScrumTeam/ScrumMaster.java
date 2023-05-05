package day48_OOP_Review.ScrumTeam;

public class ScrumMaster extends Employee {
    public ScrumMaster(String name, int age, char gender, double salary, int id, String departmentName) {
        super(name, age, gender, "Scrum Master", salary, id, departmentName);
    }
}
