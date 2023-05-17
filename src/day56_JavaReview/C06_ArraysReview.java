package day56_JavaReview;

import java.util.Arrays;

public class C06_ArraysReview {
    public static void main(String[] args) {


        int[] numbers = {5, 10, 15, 20, 25, 30};  // array literal used if we know all the elements if the array
                       //0   1   2   3   4   5
//    int[] num;
//    num={1,2,3,4,5};

        System.out.println("numbers[3] = " + numbers[3]);
        numbers[5]=50;

        int[]numbers2 = new int[6];   // new keyword: if we know the number of elements;
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i]= (int) Math.pow(2,i);
        }

        System.out.println(numbers);
        System.out.println(numbers2);

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));


        String[] arr1 = {"Ayse","Serkan","Emine"};
        String[] arr2 = {"Hatice","Salih","Umit"};

        String [][] arr2D={arr1,arr2};

        System.out.println(Arrays.toString(arr2D));
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));


        char [] hollyNameChars = "HARUN".toCharArray();

        for (int i = 0; i < hollyNameChars.length; i++) {
            System.out.println(hollyNameChars[i]);
        }

        System.out.println("-----------------------------");

        for (char hollyNameChar : hollyNameChars) {
            System.out.println(hollyNameChar);
        }


    }
}
