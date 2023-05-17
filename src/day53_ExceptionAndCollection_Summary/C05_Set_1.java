package day53_ExceptionAndCollection_Summary;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set_1 {

    public static void main(String[] args) {

        //2x+5x

        Set<String> set=new TreeSet<>();

        set.add("5");
        set.add("5");
        set.add("4");
        set.add("8");
        for (String a:set){
            System.out.print(a+" ");
        }




    }
}
