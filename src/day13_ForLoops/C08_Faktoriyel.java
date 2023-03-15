package day13_ForLoops;

import java.util.Scanner;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        //Faktoriyel = Girilen sayiya kadar olan sayilarin carpimi
        //3!= 3*2*1 = 6
        //4! = 4*3*2*1= 24 =4*3!
        //5!= 5*4*3*2*1  = 120
        //0!=1
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi: ");
        int num=scan.nextInt();

        int faktoriyel=1;

        for (int i=1;i<=num; i++){
            faktoriyel*=i;
        }

        System.out.println(num+"! = "+faktoriyel);

    }
}
