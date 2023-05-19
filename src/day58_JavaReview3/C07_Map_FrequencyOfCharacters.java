package day58_JavaReview3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class C07_Map_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

        Map<String,Integer> result= new LinkedHashMap<>();
        String[] charArray = str.split("");
        for (int i = 0; i < charArray.length; i++) {
            Integer freq = Collections.frequency(Arrays.asList(charArray),charArray[i]);
            result.put(charArray[i],freq);
        }

        System.out.println(result);



    }

}

/*
Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */