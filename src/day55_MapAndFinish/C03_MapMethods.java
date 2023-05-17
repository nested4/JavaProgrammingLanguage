package day55_MapAndFinish;

import java.util.Map;
import java.util.TreeMap;

public class C03_MapMethods {

    public static void main(String[] args) {
        //put() ,get(),values(),keyset(),clear(),containsKey(),remove(),entrySet(),equals(),forEach(),isEmpty()
        //putAll(),replace()
/*
        Map<Integer,String> map=new TreeMap<>(); //keylere göre doğal sıralama
        map.put(12,"Harun koc");
        map.put(13,"Ziya Aslan");
*/
        Map<Integer,String> map2=new TreeMap<>(); //keylere göre doğal sıralama
        map2.put(12,"Harun koc");
        map2.put(13,"Ziya Aslan");
       // System.out.println(map.get(13));
      //  System.out.println(map.values());
/*
       Set<Integer> set= map.keySet();
       List<Integer> list=new ArrayList<>();
       set.forEach(x-> list.add(x));
       Collections.sort(list);
        Integer id=Collections.max(map.keySet())+1;
        Integer id2= list.get(list.size()-1)+1;
        map.put(id,"Ayse yılmaz");

      //  map.clear();
        map.containsKey(12); //true
        */
       // System.out.println(map.remove(12));
     // System.out.println(map.remove(12, "Harun koc"));

      //  System.out.println(map.entrySet());
       // System.out.println(map.equals(map2));
       // map.forEach((k,v)-> System.out.println("key:"+k+"value:"+ v));
       // System.out.println(map.isEmpty());

      //map.putAll(map2);


        Map<Integer,String> map=new TreeMap<>(); //keylere göre doğal sıralama
        map.put(12,"Ayse yılmaz");
        map.put(13,"Ziya Aslan");
       // System.out.println(map.replace(12, "Ayse yılmaz")); //String döndürür eski veriyi döndürür işlemi yapar
      System.out.println(map.replace(12, "Ayse yılmaz", "Emine hanım"));

        System.out.println(map);

    }




}
