package day19_Custommethods_Return;

public class C07_Initials {
    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void main(String[] args) {
        System.out.println("initials(\"ahmet\",\"ozturk\") = " + initials("ahmet", "ozturk"));
    }
    public static String initials(String firstName, String lastName){
        String result="";
        result=firstName.charAt(0)+"."+lastName.charAt(0);
        result=result.toUpperCase();
        return result;
    }
}
