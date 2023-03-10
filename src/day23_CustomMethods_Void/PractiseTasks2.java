package day23_CustomMethods_Void;

import java.util.Arrays;

public class PractiseTasks2 {
    public static void main(String[] args) {
        dollarToTL(1515);
        System.out.println("------------------------------");
        kgToLbs(23);
        System.out.println("------------------------------");
        signOfNumber(-17);
        signOfNumber(20);
        signOfNumber(0);
        System.out.println("------------------------------");
        eachCharInAString("Murat gilin damindan atlayamadim.");
        System.out.println("------------------------------");
        int[] arr = {1, 2, 3, 4, 5, 6};
        elementsOfArray(arr);
        System.out.println("------------------------------");
        calculator(10, 5, '*');
        calculator(10, 5, '/');
        calculator(10, 5, '+');
        System.out.println("------------------------------");
        firstLEtterCapital("CengiZ", "KURdogLU");
        System.out.println("------------------------------");
        isAnagram("silent", "lsten");

    }

    //	10. create a method that can can convert dollar to lira
    public static void dollarToTL(int dollar) {
        System.out.println(dollar + " dollar makes " + (Math.round(dollar * 18.321 * 100)) / 100.0 + " TL");
    }

    //	11. create a method that can convert kg to lb
    public static void kgToLbs(double kg) {
        System.out.println(Math.round(kg * 100) / 100.0 + " kg makes " + Math.round(kg * 2.20462262 * 100) / 100.0 + " lbs");
    }

    //	12. create a method that can if the given integer is positive, negative or zero
    public static void signOfNumber(int number) {
        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else if (number > 0) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println(number + " is zero");
        }
    }

    //	13. create a method named printEachChar that can print each characters of a string
    public static void eachCharInAString(String str) {
        for (char chars : str.toCharArray()) {
            System.out.print(chars + " ");
        }
    }

    //	14. create a method named printEachElement that can print each elements of an integer array
    public static void elementsOfArray(int[] arr) {
        for (int each : arr) {
            System.out.println(each);
        }
    }

    //
//	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculator(double n1, double n2, char operator) {
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) { // Operator: +, -, *, /

            switch (operator) {

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);

            }

        } else {
            System.err.println("Invalid Operator: " + operator);
        }
    }

    //
//	16.  write a method that can print out the full name of a person in regular format
//            ex:
//               fullName("cYdEo", "SCHOOL");
//
//                output:
//                    "Cydeo School"
    public static void firstLEtterCapital(String name, String surname) {
        String result = "";
        result += name.substring(0, 1).toUpperCase();
        result += name.substring(1, name.length()).toLowerCase();
        result += " ";
        result += surname.substring(0, 1).toUpperCase();
        result += surname.substring(1, surname.length()).toLowerCase();

        System.out.println(result);
    }

    //
//    17. create a method that can check if two strings are anagram
//    		ex:
//    			anagram("silent", "listen")
//
//
//			output:
//				silent and listen are anagram
    public static void isAnagram(String str1, String str2) {
        char[] chArray1 = str1.toCharArray();
        char[] chArray2 = str2.toCharArray();
        Arrays.sort(chArray2);
        Arrays.sort(chArray1);
        if (Arrays.equals(chArray1, chArray2)) {
            System.out.println(str1 + " and " + str2 + " is anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " is not anagram");

        }

    }
}
