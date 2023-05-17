package day54_LoopsAndMap;

import java.util.*;

public class Loops {

    public static void main(String[] args) {
       //1.For each loop
        //2.Any other loop(for, while, do while) by using get(index) method
        //3. Iterator
        //4.forEach method that came with java 8 (lambda expression)
/*
String[] arr={"Harun","Mehmet","Ahmet"};

        for (String str: arr) {
            System.out.println(str);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Set set1=new HashSet();
        Set<Integer> set2=new HashSet<Integer>();
        Set<Integer> set3=new HashSet<>();

        List<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(14);
/*
        for (Integer sayi: list) {
            System.out.print(sayi+" ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
*/
//sen 25 den küçük olan sayıları sil listi ekrana yazdırın

//25 35 8 14
        /*
        for (Integer sayi: list) {
           if (sayi<25){
               list.remove(sayi);
           }
        }
        System.out.println(list); */

//25 35 8 14
     /*  // 25 35 14
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)<25){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        */

       Set<Integer> set=new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);

      /*  for (Integer sayi:set) {
            System.out.println(sayi);
        }
*/
//set içerisinden 25 den küçük olanları silin seti ekrana yazdırın
        //25 35 8 14
    /*    Set<Integer> set1=new HashSet<>();
        for (Integer sayi:set){
            if (sayi>=25){
                set1.add(sayi);
            }
        }
        System.out.println(set1);
*/

        //set içerisinden 25 den küçük olanları silin seti ekrana yazdırın
        //25 35 8 14
/*
    Iterator<Integer> iterator= set.iterator();

while(iterator.hasNext()){
    Integer sayi= iterator.next();
    if(sayi<25){
        iterator.remove();
    }
}
        System.out.print(set);


List<String> list=Arrays.asList("Harun","Ahmet","Hasan");

Iterator itr=list.iterator();
System.out.println(itr.next());
System.out.println(itr.next());
System.out.println(itr.next());
        System.out.println(itr.hasNext());

        System.out.println(itr.next());
*/
        //Foreach metot
        List<String> list=Arrays.asList("Harun","Ahmet","Hasan");
        for (String str:list) {
            System.out.print(str);
        }
        System.out.println();

   list.forEach(x-> System.out.print(x));
   List<Integer> list1=new ArrayList<>();
   set.forEach(y-> list1.add(y));
   System.out.println(list1);


   for (    ;    ;      ){

   }

    }
}
