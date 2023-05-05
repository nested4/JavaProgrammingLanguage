package day35_Arrays_Summary;

import java.util.Arrays;

public class ArraysSummary {

    public static void main(String[] args) {
        int array[]= new int[5];
      array[0]=10;
      array[1]=20;
      array[2]=30;
        array[3]=30;
        array[4]=30;
        System.out.println(Arrays.toString(array));
        String str=Arrays.toString(array);
        //String str1="[10, 20, 30, 30, 30]";
        String[] yeniArray=str.replace("[","").replace("]","")
                .replace(",","").split(" ");
        String[] yeniArray1=str.substring(1,str.length()-2).replace(",","").split(" ");
        for (int i = 0; i <array.length ; i++) {
           // System.out.println(array[i]);
        }

        for (int sayi:array){
            //1.döngü sayi=array[0]
            //2.döngü sayi=array[1]
            //3.döngü sayi=array[2]
            //4.döngü sayi=array[3]
            //5.döngü sayi=array[4]
        }

    }
    public static String arrayYazdir(int[] arr){
        String result="";
        for (int sayi:arr){
           result+=sayi+" ";
        }
        return  result;
    }
    public static String[] terstenYazdir(String str){
        //   marhaba     //merhaba.split("")  // String []yeniArray={"m","e","r","h","a","b","a"}
                                                 //                   0   1   2   3   4   5   6
                                             // String []resultArray={"a","b","a","h","r","e","m"}
        String [] yeniArray=str.trim().split("");
        String[]  resultArray=new String[yeniArray.length];

        for (int i = 0,j= yeniArray.length-1,k=1; i < yeniArray.length ; i++,j--) {
            //          0            6
            resultArray[i]=yeniArray[j];

        }

        return resultArray;
    }




}
