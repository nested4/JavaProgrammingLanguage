package day45_FinalAndHidding_2.day48_OOP_Review.ScrumTeam;

public class Tester extends Employee implements DevTeam {

    public String programmingLanguge;

    public Tester(String name, int age, char gender, double salary, int id, String departmentName,
                  String programmingLanguge) {
        super(name, age, gender, "Tester", salary, id, departmentName);
        this.programmingLanguge = programmingLanguge;
    }

    @Override
    public void coding() {
        System.out.println(jobTitle + " " + name + " is coding in testing framework using " + programmingLanguge);
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + " is finding bugs");
    }
}
