package day13_ForLoops;

import java.util.Scanner;

public class C03_NegativePositiveTernary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scan.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        } else if (n<0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }

        System.out.println("-----------------------------");

        String result = (n>0) ? "Positive Number" : (n<0) ? "Negative Number" : "Zero";
        //      n=-5    (n>0) ? "Positive Number" :  "Negative Number"
        //      n=0     (n>0) ? "Positive Number" : "Zero"


    }
}
