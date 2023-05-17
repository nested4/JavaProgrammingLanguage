package day56_JavaReview;

public class C03_StringClasses {
    public static void main(String[] args) {


        //String Literals are shared in String Pool
        //String literal is faster than new keyword
        String str = "school";
        String str1 = "school";
        String str2 = new String("school");
        String str3 = new String("school");

//        StringBuffer stringBuffer = "school";   //String literal string pool, cannopt be used in StringBuffer and String Builder
//        StringBuilder stringBuilder = "school";

        str.toUpperCase(); // "SCHOOL" new string object, have no reference after this line aligible for garbage collection
        System.out.println(str);  // strings are immutable "school";

        String str4 = str1.toUpperCase();
        System.out.println(str4);

        StringBuffer stringBuffer = new StringBuffer("school");
        System.out.println("stringBuffer = " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("school");
        System.out.println("stringBuilder = " + stringBuilder);

        str1.concat(" garden");    //"school garden"
        System.out.println("str1 = " + str1);

        // StringBuilder and StringBuffer are mutable.
        stringBuilder.append(" garden");
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuffer.append(" garden");
        System.out.println("stringBuffer = " + stringBuffer);

        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());


    }
}
