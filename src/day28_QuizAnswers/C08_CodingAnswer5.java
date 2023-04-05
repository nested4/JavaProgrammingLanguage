package day28_QuizAnswers;

public class C08_CodingAnswer5 {
    public static void main(String[] args) {
        System.out.println("concat(\"Quiz\",\"Kolaydi\") = " + concat("Quiz", "Kolaydi"));
        System.out.println("concat(\"Quiz\",\"Cok\",\"Kolaydi\") = " + concat("Quiz", "Cok", "Kolaydi"));
    }

public static String concat(String str1,String str2){
    return str1.concat(str2);
}
public static String concat(String str1,String str2,String str3){
    return str1.concat(str2).concat(str3);
}

}


/*5-Concat işlemi yapan 2 adet ve 3 adet değer alacak iki farklı overloading metot
yazınız.*/