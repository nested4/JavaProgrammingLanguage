package day13_ForLoops;

import java.util.Scanner;

public class C04_NameOfMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between [1-12] :");
        int n = scan.nextInt();
        String result = "";

        if (n >= 1 && n <= 12) {
            if (n == 1) {
                result = "January";
            } else if (n == 2) {
                result = "February";
            } else if (n == 3) {
                result = "March";
            } else if (n == 4) {
                result = "April";
            } else if (n == 5) {
                result = "May";
            } else if (n == 6) {
                result = "June";
            } else if (n == 7) {
                result = "July";
            } else if (n == 8) {
                result = "August";
            } else if (n == 9) {
                result = "September";
            } else if (n == 10) {
                result = "October";
            } else if (n == 11) {
                result = "November";
            } else if (n == 12) {
                result = "December";
            }
        } else {// the number is invalid
            result = "Invalid Number";
        }

        System.out.println(result);
        System.out.println("------------------------------------------");

        String nameOfMonth= (n >= 1 && n <= 12)? (n==1)?"January": (n==2)?"February": (n==3)? "March":
                (n==4)?"April":(n==5)?"May":(n==6)?"June":(n==7)?"July":(n==8)? "August": (n==9)? "September":
                        (n==10)?"October":(n==11)?"November":"December":"Invalid Number";
        System.out.println(nameOfMonth);


    }
}
