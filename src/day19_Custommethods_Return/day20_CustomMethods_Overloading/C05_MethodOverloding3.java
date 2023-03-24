package day19_Custommethods_Return.day20_CustomMethods_Overloading;

public class C05_MethodOverloding3 {


    public static void main(String[] args) {

        concat("aFM",5,true);
        concat("aFM",5,false);
        concat("Ferid",5);
    }


//Bir method yazın 3 parametreli olsun. İnt ve String type ve birde boolean 3 degisken alsin
// Boolean true ise int ve String değericoncat yapsın.
// False ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.

    public static void concat(String str, int i, boolean bl){
        if (bl){
            System.out.println(str + i);
        }else{
            concat(str,i);
        }
    }
    public static void concat(String str, int i){
        for (int j = 0; j < i; j++) {
            System.out.println(str);
        }
    }

}
