package day50_Exception_Collection;

import day48_OOP_Review.ScrumTeam.Person;

import java.util.ArrayList;

public class C06_Collection_1 {
    public static void main(String[] args) {
        ArrayList<Person> arrayList=new ArrayList<>();

        Person person1=new Person("harun",25,'E');
        Person person2=new Person("mehmet",25,'E');
        Person person3=new Person("ahmet",25,'E');

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);

        ArrayList<Integer> arrayList1=new ArrayList<>();
arrayList1.add(25);
arrayList1.add(25);
arrayList1.add(35);
        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(25);
        arrayList2.add(45);
        arrayList2.add(55);
       arrayList1.addAll(arrayList2);
       // 25,25,35,25,45,55
        //25,45,55,55
       // System.out.println(arrayList1.isEmpty());
     //arrayList1.clear();
       // arrayList1.remove(0);
       // arrayList1.removeAll(arrayList2);
        //System.out.println(arrayList1.get(0));
        //System.out.println(arrayList1);
        // 25,25,35,25,45,55
       // System.out.println(arrayList1.contains(25));
        arrayList2.add(55);
        System.out.println(arrayList1.containsAll(arrayList2));
    }


}
