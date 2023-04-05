package day28_QuizAnswers;

public class C10_CodingAnswer7 {
    public static void main(String[] args) {
        System.out.println("equalsIgnoreCase(\"Ahmet\",\"AHmeT\") = " + equalsIgnoreCase("Ahmet", "AHmeT"));
    }

    public static boolean equalsIgnoreCase(String str1,String str2){
        return str1.toLowerCase().equals(str2.toLowerCase());
    }
}
/*equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
büyükküçük harfleri baz almadan kontrol eden bir metot yazınız*/