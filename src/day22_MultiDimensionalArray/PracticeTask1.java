package day22_MultiDimensionalArray;

import java.util.Arrays;

public class PracticeTask1 {
    /*
    1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

[0][0]=[1][2]
[0][1]=[1][1]
[0][2]=[1][0]
		output:
			reverse = { {6,5,4}, {3,2,1}};*/

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
//        int[][] reverse = Arrays.copyOf(arr2D,arr2D.length);
        int[][] reverse = new int[2][3];

        for (int i = arr2D.length - 1,i1=0; i >= 0; i--,i1++) {
            for (int j = arr2D[i].length - 1,j1=0; j >= 0; j--,j1++) {
                System.out.print(arr2D[i][j]+" ");
//                System.out.println("i1="+i1+" j1="+j1);
//                System.out.println("i="+i+" j="+j);
                reverse[i1][j1]=arr2D[i][j];
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}
