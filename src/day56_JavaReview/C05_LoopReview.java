package day56_JavaReview;

import java.util.Scanner;

public class C05_LoopReview {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++ ){
            if(i%5==0){
//                break;
                continue;
//                return;
            }
            System.out.println("number "+i);
        }
        System.out.println("Loop is over");

        System.out.println("---------------------------------");

        Scanner scan = new Scanner(System.in);
        int num=0;
        while(num<100) {
            System.out.println("Enter a number");
            num = scan.nextInt();
            System.out.println("num = " + num);
        }


    }


}
