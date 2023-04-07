package day30_Review;

public class C01_DigitsLettersSpecialChars {

    public static void main(String[] args) {

        char ch = 'A';
        int num1 = 'A';
        int num2 = 'Z';
        int num3 = 'a';
        int num4 = 'z';

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
//        {
//            int num1=5;
//        }
//        System.out.println(num1);  // num1 is out of scope

        seperateCharacters("ABCDExyz1234567890) (*&^%$#@!");
    }


    public static void seperateCharacters(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  //each char of str

            if (ch >= 'A' && ch <= 'Z') {  // checks if ch is A-Z
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                if (ch != ' ') specialChars += ch;

            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }


}


/*Create a method that takes a String and prints out 3 different String of Letters, digits and special chars
 * of that string to console. space is not considered as a special char
 * input:
 * "ABCDExyz1234567890) (*&^%$#@!"
 *digits = 1234567890
 letters = ABCDExyz
 specialChars=)(*&^%$#@!
 *
 * */