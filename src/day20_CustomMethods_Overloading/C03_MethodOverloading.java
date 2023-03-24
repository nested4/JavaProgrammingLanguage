package day20_CustomMethods_Overloading;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);
        System.out.println("sum1 = " + sum1);

        // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10, 20, 30);
        System.out.println("sum2 = " + sum2);

        // sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);
        System.out.println("sum3 = " + sum3);

        // sum of 18.2 and 30.7
        double sum4 = sumOfNumbers(18.2, 30.7);
        System.out.println("sum4 = " + sum4);

        //sum of 5.5, 4.5, 6.5
        double sum5 = sumOfNumbers(4.5 , 5.5, 6.5);
        System.out.println("sum5 = " + sum5);

        // sum of 4.5, 3.5, 2.5, 6.5
        double sum6 = sumOfNumbers(4.5 , 3.5, 2.5, 6.5);
        System.out.println("sum6 = " + sum6);


    }


    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }





}
/*
 1. create a method that can find the sum of two numbers


	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */