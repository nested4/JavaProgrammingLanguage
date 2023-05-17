package day55_MapAndFinish;

import java.util.*;

public class C02_IteratorSummary {


    public static void main(String[] args) {

        //3. Iterator


        //obje obje obje obje obje

        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(8);
        set.add(35);
        set.add(27);
        Iterator<Integer> iterator=set.iterator();
     //8 12 27 35
       while (iterator.hasNext()){
          Integer sayi=iterator.next();
           if(sayi>25){
              iterator.remove();

           }
       }


        System.out.println(set);

        //4.forEach method that came with java 8 (lambda expression)

        set.forEach(x-> System.out.println(x));

        List<String> list=Arrays.asList("Harun","Ahmet","Mehmet");

        list.forEach(x-> System.out.println(x+" Hoşgeldiniz"));



    }
}
