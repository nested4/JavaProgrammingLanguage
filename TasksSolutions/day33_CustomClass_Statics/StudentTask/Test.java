package day33_CustomClass_Statics.StudentTask;

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student("Jimmy", 39, 'M', 14, 25, 16, 'C');

        Student student2 = new Student("Kathy", 29, 'F', 15, 25, 13, 'A');

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();



    }

}
