package day35_Arrays_Summary;

import java.util.Arrays;

public class ArraysSummary_2 {

    public static void main(String[] args) {
/*
        String str="Marahaba";
        String[] strArray=str.split("a");
        System.out.println(Arrays.toString(strArray));
        for (String s:strArray){
            System.out.println(s);
        }
        System.out.println(strArray.length);
*/
/*
        String[] strArray={"harun","Ayşe","mehmet"};
        String[] yeniArray=Arrays.copyOfRange(strArray,0,strArray.length);

        System.out.println(Arrays.toString(yeniArray));
       /* String[] yeniArray=new String[strArray.length];
        for (int i = 0; i < strArray.length ; i++) {
            yeniArray[i]=strArray[i];
        }
        */

        int[] arr={9,6,3,1,0,2,4,7,8,5};
        System.out.println(Arrays.toString(doldur(arr, 0, 3, 100)));

        System.out.println(Arrays.toString(arr));


    }

    public static int[] doldur(int[] arr, int from, int to,int value){
 int[] resultArray=Arrays.copyOfRange(arr,0,arr.length);
         Arrays.fill(resultArray,from,to,value);
        return  Arrays.copyOfRange(resultArray,0,arr.length);

    }

    public static int maxArray(int[] array){
        int[] yeniArray=Arrays.copyOfRange(array,0,array.length);
       Arrays.sort(yeniArray);
       return yeniArray.length-1;
    }





}
