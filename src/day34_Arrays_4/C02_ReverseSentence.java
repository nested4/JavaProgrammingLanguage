package day34_Arrays_4;

public class C02_ReverseSentence {

    public static void main(String[] args) {
        System.out.println(reverseSentence("Today is a perfect day to learn Java"));

    }


    public static String reverseSentence(String str) {
        String reversed = "";
        String[] words = str.split(" ");
//        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            reversed+=words[i]+" ";
        }

        return reversed;
    }
}

/*
 Write a method that can reverse a sentence
 Ex:
 sentence = "Today is a perfect day to learn Java";

 output:
 Java learn to day perfect a is Today
 */