package day50_Exception_Collection;

public class C01_Exception_5 {


    public static int faktoriyel(int n){
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result*=i;
        }
        return result;
    }

    public static int faktoriyel_better(int n){
        int result=1;
        try {
            for (int i = 1; i <=n ; i++) {
                result*=i;
            }
            return result;
        }catch (Exception e){
            return  -1;
        }

    }



}
