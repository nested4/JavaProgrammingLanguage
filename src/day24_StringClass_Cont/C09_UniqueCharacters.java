package day24_StringClass_Cont;

public class C09_UniqueCharacters {
    public static void main(String[] args) {
        String str = "abccfff";
        String result = ""; //bd
        for (int i = 0; i < str.length();i++){
            char ch=str.charAt(i); //a
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result);

    }
}

/*Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */