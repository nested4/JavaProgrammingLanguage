package day44_FinalAndHiding;

import java.util.ArrayList;

public class Main  {


    public static void main(String[] args) {


   /*  final String[] strArr= {"Harun","Mehmet","Ahmet"};
        String[] strArr2= {"Orhan","cansu","naime"};
          strArr=strArr2;
          strArr2=strArr;

      final  String str= new String("Harun");
        str="Mehmet";

    */


    final  ArrayList<Integer> arrayList=new ArrayList<>();
       ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList.add(250);
        arrayList.add(350);
        arrayList.set(0,600); //600,350
       // arrayList=arrayList2;
        arrayList2=arrayList;
        System.out.println(arrayList2.get(0));


/*FinalExample finalExample=new FinalExample();
//finalExample.X=100;


        System.out.println(finalExample.x);
        finalExample.method();
        System.out.println(finalExample.x);
        finalExample.x=45;
*/
    }
}
