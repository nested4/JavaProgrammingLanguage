package day51_Collection_List;

import java.util.*;

public class C01_Collections {

    public static void main(String[] args) {



    /* Collection nesneleri objeleri bir arada tutan yapilar
       Karsilasilan istenilen durumlara gore kullanilan collection yapilari farklilik gosterir
       Hangi collection tipini kullanacagimizi belirleriz

       3 ana collection tipi var
       1- List :    ArrayList, LinkedList, Vector (Stack)
       2- Queue:    Priority Que, Arrayque
       3- Set:      Hashset, Linkedhashset,TreeSet

       interfacelerden obje olusturamadigimiz icin child classlarin constructorlari kullanilarak objeler olusturuyoruz.
    *
    *
    *
    *
    * */

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        //        arr[4] =5;  //ArrayIndexOutOfBoundsException


//        List<String> coll1= new List<String>();   // Interface Obje olusturamiyoruz
        List<String> coll2 = new ArrayList<>();
        List<Objects> coll3 = new LinkedList<>();
        Queue<String> coll4 = new LinkedList<>();
        Queue<String> coll5 = new PriorityQueue<>();
        List<String> coll6 = new Stack<>();
        List<String> coll7 = new Vector<>();

        Set<String> coll8 = new HashSet<>();
        Set<String> coll9 = new TreeSet<>();
        Set<String> coll0 = new LinkedHashSet<>();
        HashSet<String> set1 = new HashSet<>();


    }
}