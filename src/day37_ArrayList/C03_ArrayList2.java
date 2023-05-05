package day37_ArrayList;

import java.util.ArrayList;

public class C03_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("elma");
        arrList.add("armut");
        arrList.add("kayısı");
        arrList.add("üzüm");
        arrList.add("erik");
//Birinci arrayList e elma, armut, kayısı, üzüm, erik;
//İkinci arrayListe e armut, kayısı, üzüm değerlerini atayalım ve
// İlk arrayList in içinden ikinci arrayList i çıkartalım.
        ArrayList<String> arrList2=new ArrayList<>();
        arrList2.add("armut");
        arrList2.add("kayısı");
        arrList2.add("üzüm");

        System.out.println("ilk arrayList"+arrList);
        System.out.println("ikinci arrayList"+arrList2);
        arrList.removeAll(arrList2);
        System.out.println("ilk arryin son hali"+arrList);



    }
}
