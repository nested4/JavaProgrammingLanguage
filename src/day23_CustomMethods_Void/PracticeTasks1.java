package day23_CustomMethods_Void;

public class PracticeTasks1 {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("-------------------------------------------------------");
        evenNumbers();
        System.out.println("-------------------------------------------------------");
        eligibleForAlcoholPurchase(20);
        System.out.println("-------------------------------------------------------");
        eligibleToVote(19, "Turkey");
        System.out.println("-------------------------------------------------------");
        grades(75);
        grades(85);
        grades(55);
        System.out.println("-------------------------------------------------------");
        areaOfCircle(3);
        System.out.println("-------------------------------------------------------");
        areaofSquare(2);
        System.out.println("-------------------------------------------------------");
        dollarToEuro(1500);

    }

    //	1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void oddNumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //	2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void evenNumbers() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //	3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleForAlcoholPurchase(int age) {
        if (21 <= age) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Ineligible to buy alcohol");
        }
    }

//	4. create a method that can check if a person is eligible to vote
//			Ex:
//				eligibleToVote(19, "USA");
//
//			output:
//				You are not eligible to vote!

    public static void eligibleToVote(int age, String citizenship) {
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("USA"); //True
        System.out.print("You are ");
        if (!isEligible) System.out.print("not ");
        System.out.print("eligible to vote!");

    }

    //	5. create a method that can calculate the grade of the student based on the score
    public static void grades(int score) {
        int grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your score is " + score + ", and grade is " + (char) grade);
    }

    //	6. create a method that can calculate the area of a circle
    public static void areaOfCircle(int radius) {
        double area;
        area = Math.PI * Math.pow(radius, 2);
        area = Math.round(area * 100.0) / 100.0;
        System.out.println("Circle with a radius " + radius + " cm has an area of " + area + " cm²");
    }

    //	7. create a method that can calculate the area of a square
    public static void areaofSquare(int side) {
        System.out.println("Square with sides of " + side + " cm has an area of " + Math.pow(side, 2) + " cm²");
    }

    //	9. create a method that can convert dollar to euro
    public static void dollarToEuro(int dollar) {
        System.out.println(dollar + " dollar is " + Math.round((dollar / 0.9974) * 100.0) / 100.0 + " Euros");
    }

}
