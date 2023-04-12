package day33_Arrays_3;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Tasks {
    public static void main(String[] args) {
        int[] intArr = {1, 20, 3, -400, 50, 6};
        System.out.println(maxOfArray(intArr));
        System.out.println("----------------------------");
        System.out.println(minOfArray(intArr));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(swapFirstAndLast(intArr)));
        System.out.println("----------------------------");

        int[] intArr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(intArr2)));
        System.out.println("----------------------------");


        System.out.println(sumOfArrayElements(intArr2));
        System.out.println("----------------------------");

        System.out.println(Arrays.toString(createStringArray()));


    }

    //    int array in en büyük elemanını döndüren bir method yazın
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //    int array in en kucuk elemanını döndüren bir method yazın
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    //    Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın
    public static int[] swapFirstAndLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

//    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.

    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }

    //Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.
    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

//Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
//bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun.

    public static String[] createStringArray() {

        Scanner scan = new Scanner(System.in);
        System.out.println("String arrayin uzunlugunu giriniz: "); //5

        int length = scan.nextInt();
        scan.nextLine();
        String[] strArr = new String[length];  //

        for (int i = 0; i < strArr.length; i++) {
            System.out.println("String Arrayin " + (i + 1) + ". elemanini giriniz:");
            strArr[i] = scan.nextLine();
        }
        return strArr;
    }


}
