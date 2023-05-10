package day51_Collection_List;

import java.util.*;

public class C03_List {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(5,10,15,20,25));

        list1.add(5);
        System.out.println(list1);
        System.out.println("list1.get(3) = " + list1.get(3)); // Arraylist is better than linkedlist wrt get() feature

        List<Integer> list2= new LinkedList<>();
        list2.addAll(Arrays.asList(5,10,15,20,25));
        list2.add(5);
        list2.add(9);                     //   Linklist is faster than arraylist wrt add() amd remove()
        list2.remove(list2.indexOf(9));   //
        System.out.println(list2);
        System.out.println("list2.get(3) = " + list2.get(3));

        List<Integer> list3= new Vector<>();
        list3.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list3.get(2));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list4.get(2));

        System.out.println("-----------------------------------");
        System.out.println(list4);
        System.out.println(((Stack) list4).pop());    // LIFO
        System.out.println(list4);
        System.out.println(((Stack) list4).push(60));    // LIFO
        System.out.println(list4);




    }
}
