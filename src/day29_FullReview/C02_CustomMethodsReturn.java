package day29_FullReview;

import java.util.Scanner;

public class C02_CustomMethodsReturn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is an Even number");
        }

        System.out.println("---------------------------------------------");
        System.out.println("ageOfPerson(1995) = " + ageOfPerson(1995));

        System.out.println("---------------------------------------------");
        System.out.println("printNumbers(10,20) = " + printNumbers(10, 20));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static int ageOfPerson(int birthYear) {
        return 2023 - birthYear;
    }

    public static String printNumbers(int X, int Y) {
        String result = "";
        for (int i = X + 1; i < Y; i++) {
            result += i + " ";
        }
        return result;
    }
}
