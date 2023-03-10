package day33_CustomClass_Statics.StudentTask;

public class Student {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber, groupNumber;
    public char grade;

    public static String schoolName = "TechSchool";
    public static String programmingLanguage = "Java";

    public Student(String name, int age, char gender, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }


}

/*
1. Create a class named Student:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */