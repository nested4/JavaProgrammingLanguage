package day30_Review;

import java.util.Scanner;

public class C02_SwitchSeasons {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the month number as an integer (1-12): ");
        int month=scan.nextInt();
        System.out.println("whichSeason("+month+") = " + whichSeason(month));

    }


    public static String whichSeason(int month){
        String season="";
        switch (month){
            case 12:
            case 1:
            case 2:
                season="Winter";
                break;
            case 3,4,5:
                season="Spring";
                break;
            case 6,7,8:
                season="Summer";
                break;
            case 9,10,11:
                season="Fall";
                break;
            default:
                season="Invalid Month Number";
        }
        return season;
    }
}
// Write a method that takes the month number from the user and returns the season.
