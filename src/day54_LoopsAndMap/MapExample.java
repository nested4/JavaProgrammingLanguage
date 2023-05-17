package day54_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
     /*   Map<String,String> map=new HashMap<>();

        map.put("12345","Harun");
        map.put("123456","Harun2");
        map.put("1234567","Harun3");
       // map.put("12345","Harun");
        System.out.println(map.get("123456"));
        */

        //manav meyveler ve fiyatlar

        Map<String,Double> meyveFiyat=new HashMap<>();
        meyveFiyat.put("Elma",3.75);
        meyveFiyat.put("Elma",3.90);
        meyveFiyat.put("Muz",56.90);
        meyveFiyat.put("Çilek",50.0);
        meyveFiyat.put("Armut",30.30);
        meyveFiyat.put("Muz",60.05);
      //  meyveFiyat.remove("Elma");
       // meyveFiyat.clear();

       // System.out.println(meyveFiyat.containsKey("Elma"));
      //  System.out.println(meyveFiyat.containsValue(30.30));
       Set<String> set=meyveFiyat.keySet();
      // set.forEach(x-> System.out.println(x));

        for (String str: set) {
            System.out.println(meyveFiyat.get(str));
        }



        // TreeMap {Armut=30.3, Elma=3.75, Muz=56.9, Çilek=50.0}
        //HashMap  {Armut=30.3, Muz=56.9, Çilek=50.0, Elma=3.75}

      //  System.out.println(meyveFiyat);
     //   System.out.println(meyveFiyat.get("Muz"));








    }






}
