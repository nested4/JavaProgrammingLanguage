package day34_Arrays_4;

import java.util.Arrays;

public class C04_Tasks {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(buildIntArray(8)));

        System.out.println("---------------------------------------");

        int[] arr=buildIntArray(5);
        System.out.println(Arrays.toString(arr));  //[0,1,2,3,4]
        System.out.println(averageOfMaxMin(arr));  //2.0

        System.out.println("---------------------------------------");
        int[] arr1= {5,2,9,3,7,4};
        System.out.println(Arrays.toString(fillArrayWithSmallest(arr1)));

        System.out.println("---------------------------------------");
        int[] arr2= {5,2,9,3,7,4};
        System.out.println(Arrays.toString(fillArrayWithSmallestExceptBiggest(arr2)));
    }

    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]
    public static int[] buildIntArray(int n) {
        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        return intArr;
    }

    //Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    public static double averageOfMaxMin(int[] arr){
        double avg=0;
        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        avg=(min+max)/2;

        return avg;
    }

    //Bir sayı dizisinin en küçük elemani ne ise sayı dizisini onunla dolduran bir
    //method yazın

    public static int[] fillArrayWithSmallest(int[] arr){
        Arrays.sort(arr);
        int min=arr[0];
        Arrays.fill(arr,min);
        return arr;
    }
    //Bir sayı dizisinin en küçük elemani ne ise sayı dizisini (en büyük değer hariç) onunla dolduran bir
    //method yazın

    public static int[] fillArrayWithSmallestExceptBiggest(int[] arr){

        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                arr[i]=min;
            }
        }
        return arr;
    }

}
