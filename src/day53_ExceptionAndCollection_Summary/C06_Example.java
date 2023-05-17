package day53_ExceptionAndCollection_Summary;

import java.util.*;

public class C06_Example {

    ////list içerisinde bulunan polindrom (terside kendisine
    //        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.
    //        //kaşık,adanada,kazak,radar,ses,harun
    //        //adanada,kazak,radar,ses
    //
    //        //list içerisinde bulunan polindrom (terside kendisine
    //        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.(aynı kelimeleri ekrana yazma-sın)

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(2,2,5,6,9,5,8,4,6));
        System.out.println(uniqSayilar(list));

    }

    public static void polindrom(List<String> list){
        Set<String> resultSet=new TreeSet<>();

        for (int i = 0; i < list.size() ; i++) {
           if( list.get(i).equalsIgnoreCase(reverse(list.get(i))) ){
               resultSet.add(list.get(i));
           }
        }

        for (String str: resultSet){
            System.out.print(str+" ");
        }

    }

//List'in içerindeki eşi olmayan (çifti olmayan) uniq sayıları bulun list olarak döndürelim ;
//2,2,5,6,9,5,8,4,6
//5,6,9,5,8,4,6
//6,9,8,4,6
public static List<Integer> uniqSayilar(List<Integer> list){
        int count= list.size();
        List<Integer> resultList=new ArrayList();

   while(!list.isEmpty()) {
        int deger=list.get(0);
        list.removeAll(Arrays.asList(list.get(0)));
        if(list.size()==count-1) {
            resultList.add(deger);
        }
         count= list.size();
        }
       return resultList;

    }








    public static String reverse(String str){
        try {
            String result="";
            for (int i = str.length()-1; i >=0 ; i--) {
                result+=str.charAt(i);
            }
            return  result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }




}
