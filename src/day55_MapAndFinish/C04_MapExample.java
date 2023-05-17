package day55_MapAndFinish;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_MapExample {

    public static void main(String[] args) {
 /*
        Ogrenci ogrenci1=new Ogrenci("Harun","Koc",15);
        Ogrenci ogrenci2=new Ogrenci("Ayse","calıskan",17);
        Ogrenci ogrenci3=new Ogrenci("Hatice","akıllı",18);


        Map<Integer,Ogrenci> ogrenciler=new HashMap<>();

        ogrenciler.put(ogrenci1.getNo(), ogrenci1);
        ogrenciler.put(ogrenci2.getNo(), ogrenci2);
        ogrenciler.put(ogrenci3.getNo(), ogrenci3);


        ogrenciler.get(18).ekleDers("Almanca");
        ogrenciler.get(17).ekleDers("İngilizce");


        System.out.println(ogrenciler.get(17).getIsim());
        System.out.println(ogrenciler.get(17).toString());




        List<Ogrenci> list=new ArrayList<>();
        list.add(ogrenci1);
        list.add(ogrenci2);
        list.add(ogrenci3);

      for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getNo()==18){
                list.get(i).ekleDers("Almanca");
                break;
            }
        }

       |   id  |  isim  |  soyisim    |   telno    |    adres  |    öğrenimdurumu   |





*/




       // System.out.println(ogrenci3.getDersler());

/*

        Ogrenci ogrenci1=new Ogrenci("Harun","Koc",15);
        Ogrenci ogrenci2=new Ogrenci("Ayse","calıskan",17);
        Ogrenci ogrenci3=new Ogrenci("Hatice","akıllı",18);


        Map<Integer,Ogrenci> ogrenciler=new HashMap<>();

        ogrenciler.put(ogrenci1.getNo(), ogrenci1);
        ogrenciler.put(ogrenci2.getNo(), ogrenci2);
        ogrenciler.put(ogrenci3.getNo(), ogrenci3);

        Map<Integer, Person> personeller=new HashMap<>();
        Person person1=new Person();
        personeller.put(12,person1);


       List< Map >   list=new ArrayList();
       list.add(ogrenciler);
        list.add(personeller);
*/
        Map<Integer, String> yeniMap=new HashMap<>();
        yeniMap.put(12,"Harun");
        yeniMap.put(3,"Çiçek");

        Map<String,Map<Integer,String>> map=new TreeMap<>();

        map.put("1234564",yeniMap);

        System.out.println(map.get("1234564").get(12).equals("Harun"));


    }
}
