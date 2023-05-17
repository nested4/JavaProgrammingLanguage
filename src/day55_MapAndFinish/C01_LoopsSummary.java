package day55_MapAndFinish;

import java.util.ArrayList;
import java.util.List;

public class C01_LoopsSummary {

    public static void main(String[] args) {
        //1.For each loop
        List<Integer> list=new ArrayList<>();
        list.add(15);
        list.add(20);
        for (Integer x:list){
            System.out.println(x);
        }
        //2.Any other loop(for, while, do while) by using get(index) method
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        int i=0;
        while (i<list.size()){
            System.out.println(list.get(i));
            i++;
        }
        i=0;

        do {

            System.out.println(list.get(i));
            i++;
        }while (i<list.size());



        //3. Iterator
        //4.forEach method that came with java 8 (lambda expression)





    }

}
