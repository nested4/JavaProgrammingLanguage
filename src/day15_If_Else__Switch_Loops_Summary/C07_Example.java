package day15_If_Else__Switch_Loops_Summary;

public class C07_Example {
    public static void main(String[] args) {

        // soru 1  1-100 dahil çift sayılar yazın

        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for (int i = 2; i <= 100; i+=2) {

                System.out.print(i+" ");

        }
        System.out.println();
        int i=1;
        while(i<=100){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();

        int j=2;
        while(j<=100){
                System.out.print(j+" ");
            j+=2;  //j=j+2;
        }

        System.out.println();
        int k=2;
        do {
            System.out.print(k+" ");
            k+=2;
        }while (k<=100);


    }
}
