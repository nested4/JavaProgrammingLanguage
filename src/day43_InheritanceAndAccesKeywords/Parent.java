package day43_InheritanceAndAccesKeywords;

public class Parent {
    static int x;

    String parentName;
    String parentName2;
    String parentName3;
    public Parent(String parentName,String parentName2){
        this.parentName=parentName;
        this.parentName2=parentName2;
    }

    public Parent(String parentName,String parentName2,String parentName3){
     this.parentName=parentName;
        this.parentName2=parentName2;
        this.parentName3=parentName3;
    }

    public static void staticParentMethod(){

    }


}
