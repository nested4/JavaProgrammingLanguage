package day37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Harun");
        arrList.add("Ziya");
       // System.out.println(arrList.size());
       // System.out.println(arrList.get(arrList.size()-1));
        //System.out.println(arrList.isEmpty());
        arrList.add(0,"Mehtap");
        arrList.add(1,"Ümit");
        //arrList.remove(1);
       // System.out.println(arrList.get(1));
        System.out.println(arrList);
        arrList.set(1,"Emine");
        System.out.println(arrList);

        //indexOff
        System.out.println(arrList.indexOf("Mahmut"));


    }
}
