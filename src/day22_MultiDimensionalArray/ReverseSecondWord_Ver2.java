package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord_Ver2 {

    public static void main(String[] args) {

        String str = "I love Java";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        char[] chars = words[1].toCharArray();
        String  reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        System.out.println(reversed);
        words[1] = reversed;
        for (String word : words) {
            System.out.print(word+" ");
        }
    }
}
