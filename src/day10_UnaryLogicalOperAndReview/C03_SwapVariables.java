package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a sayisi icin bir tam sayi giriniz: ");
        int a = scan.nextInt(); //30

        System.out.println("b sayisi icin bir tam sayi giriniz: ");
        int b = scan.nextInt(); //15

        System.out.println("a = " + a); // a = 30
        System.out.println("b = " + b); // b = 15

        int temp=a; // temp = 30
        a=b;        //  a = 15
        b=temp ;    //  b=30;

        System.out.println("a = "+a); //a = 15;
        System.out.println("b = "+b); //b = 30;



    }
}

/*
1. write a program that can swipe two variables' value by using a temporary variable
get numbers from user;

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */