package day38_Constructors;

public class Person {
    public String name;
    public char gender;
    public int age;

    public Person(){

    }
    public Person(String ad, char cinsiyet,int yas){
        this.name=ad;
        this.gender=cinsiyet;
        this.age=yas;
    }

    public String toString(){
        return "Person{name="+name+", gender="+gender+", age="+age+"}";
    }

}
