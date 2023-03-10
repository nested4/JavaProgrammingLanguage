package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C01_PositiveOrNegative {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int number = scan.nextInt(); //-12

        boolean isPositive = number > 0;
        //         false        -12 > 0
        boolean isNegative = number < 0;
        //         true        -12 < 0
        boolean isZero = number==0;
        //       false     -12 ==0;

        //200 is positive number: true
        //200 is negative number: false
        //200 is zero: false


        System.out.println(number+" is positive number: "+isPositive);
        System.out.println(number+" is negative number: "+isNegative);
        System.out.println(number+" is zero: "+isZero);








    }


}

/*
1. Create a class called C01_PositiveOrNegative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */