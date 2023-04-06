package day21_Class_and_Methods;

import java.util.Random;

public class C01_MethodsSummary {

    public static void main(String[] args) {
       // int x=max(5,10)*10;
        //System.out.println(x);
     // int x=menu(5);
     //   System.out.println(x);


      String str=  yaziTura();
        System.out.println(str);
    }

    public static String yaziTura(){
        Random random=new Random();
        int x= random.nextInt(100);
        if(x%2==0){
            return "tura";
        }
        return "yazi";
    }

    public static int menu(int x){

        if(x==5){
            return 10;
        }
     return 20;
    }

    public static  int max(int x,int y){
        int max;
        if(x>y) {
                max = x;
        }
        else {
            max = y;
        }
       return max;
    }

    public static  int max2(int x,int y){

        if(x>y) {
          return x;
        }
        else {
           return y;
        }

    }
}
