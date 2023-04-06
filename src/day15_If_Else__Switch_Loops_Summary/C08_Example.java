package day15_If_Else__Switch_Loops_Summary;

public class C08_Example {

    public static void main(String[] args) {
/*
        for (int i = 100; i >0 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    int i=100;
        while (i>0){
            System.out.print(i+" ");
            i-=2;
        }
*/
// 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana yazdırın.
        for (int i = 0; i <=20 ; i+=3) {
            System.out.print((int)Math.pow(i,3)+" ");
        }



    }
}
