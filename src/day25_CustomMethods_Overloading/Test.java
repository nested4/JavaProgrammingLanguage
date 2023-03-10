package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------------");

        String s1 = "Cydeo School";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------------------------");

        String word = "Java";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------------------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);

        System.out.println("-----------------------------------------");
        int[] arr1 = {2, 1, 3, 5, 4};
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(Test3.merge(arr1, arr2)));
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Test3.max(arr1));
        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(Test3.reverse(arr1)));

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(Test3.reverse(names)));


    }

}
