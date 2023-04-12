package day33_Arrays_3;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {

        char[] alphabet;
        alphabet = new char[26];

        char[] charArr = {'1', '2', '3'};
        System.out.println(charArr);
        //When you print a char array using System.out.println(), Java implicitly converts each char in the array
        // to its corresponding Unicode character and prints it to the console.


        //alphabet[0]='Z';   //90
        //alphabet[1]='Y';   //89
        //alphabet[2]='X';   //88

        char ch = 'z';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = ch;
            ch--;
        }
        System.out.println(alphabet);
        System.out.println(Arrays.toString(alphabet));

        // To print each chars we can use for each loop


        ch = 'A';

        for (int i = 0; i < alphabet.length; i++, ch++) {
            alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet));


        // In a char[] write all the alphabet in reversed order
    }
}
