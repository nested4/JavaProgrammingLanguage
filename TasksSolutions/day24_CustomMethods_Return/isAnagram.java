package day24_CustomMethods_Return;

import java.util.Arrays;


public class isAnagram {
    public static void main(String[] args) {
      String  str1 = "abc";
      String  str2 = "bac";

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        boolean isAnagram;
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        isAnagram= Arrays.equals(char1, char2);
        return isAnagram;

    }


}
/*
 2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */