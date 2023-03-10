package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number :");

        int number = scan.nextInt();

        boolean isDivisibleBy2 = number%2==0;
        boolean isDivisibleBy3 = number%3==0;
        boolean isDivisibleBy5 = number%5==0;
        boolean isDivisibleBy9 = number%9==0;

        //65 is divisible by 2: false
        //65 is divisible by 3: false
        //65 is divisible by 5: true

        System.out.println(number+" is divisible by 2: "+isDivisibleBy2);
        System.out.println(number+" is divisible by 3: "+isDivisibleBy3);
        System.out.println(number+" is divisible by 5: "+isDivisibleBy5);
        System.out.println(number+" is divisible by 9: "+isDivisibleBy9);





    }
}

/*
* 2. Create a class called C02_EvenlyDivisible,and write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5

    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */