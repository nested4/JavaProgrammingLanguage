package day43_InheritanceAndAccesKeywords;

public class Child extends Parent {
    int y;


    public Child(String parentName,String parentName2){
        super(parentName,parentName2);

    }

    public Child(String parentName,String parentName2,String parentName3){
        super(parentName,parentName2,parentName3);

    }
    public Child(String parentName,String parentName2,String parentName3,int y){
        super(parentName,parentName2,parentName3);
        this.y=y;

    }

    public void childMethod(int x){
        System.out.println(x);


    }


}
