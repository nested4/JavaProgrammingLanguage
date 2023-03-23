package day18_CustomMethods;

public class C04_PracticeTasks1 {

    public static void main(String[] args) {
        oddNumbers();
        System.out.println("-------------------------------------");
        evenNumbers();
        System.out.println("-------------------------------------");
        eligibleForAlcoholPurchase(22);
        System.out.println("-------------------------------------");
        eligibleToVote(19,"TR");
        System.out.println("-------------------------------------");
        grades(50);
        System.out.println("-------------------------------------");
        areaOfCircle(1);
        System.out.println("-------------------------------------");
        areaOfSquare(4);
        System.out.println("-------------------------------------");
        dollarToTL(1500);

    }

    //	1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    /**
     * a method that can print odd numbers between 1~100 in the same line separated by space
     */
    public static void oddNumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //	2. create a method that can print even numbers between 1~100 in a same line saperated by space

    /**
     * a method that can print even numbers between 1~100 in a same line separated by space
     */
    public static void evenNumbers() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
//	3. create a method that can check if a person is eligible to buy alcohol

    /**
     * a method that can check if a person is eligible to buy alcohol
     * amd age limit is 21
     * @param age
     */
    public static void eligibleForAlcoholPurchase(int age){
        if(21<=age){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Ineligible to buy alcohol");
        }
    }

//	4. create a method that can check if a person is eligible to vote
//    Ex:
//				eligibleToVote(19, "TR");
//
//			output:
//				You are not eligible to vote!

    /**
     * a method that can check if a person is eligible to vote
     * @param age
     * @param citizenship
     */
    public static void eligibleToVote(int age,String citizenship){
        boolean isEligible = age>=18 && citizenship.equalsIgnoreCase("TR");

        System.out.print("You are ");

        if(!isEligible) System.out.print("not ");

        System.out.print("eligible to vote");
        System.out.println();
    }

//	5. create a method that can calculate the grade of the student based on the score
// score >= 90 grade 'A'
// score >= 80 grade 'B'
// score >= 70 grade 'C'
// score >= 60 grade 'D'
// score < 60 grade 'F'

    /**
     * a method that can calculate the grade of the student based on the score
     *  score >= 90 grade 'A'
     *  score >= 80 grade 'B'
     *  score >= 70 grade 'C'
     *  score >= 60 grade 'D'
     *  score < 60 grade 'F'
     * @param score
     */
    public static void grades(int score){
        char grade;
        if(score>=90){
            grade='A';
        } else if (score>=80) {
            grade='B';
        } else if (score>=70) {
            grade='C';
        } else if (score>=60) {
            grade='D';
        }else {
            grade='F';
        }

        System.out.println("Your score is "+score+ " ,and your grade is "+grade);

    }


//	6. create a method that can calculate the area of a circle

    /**
     * a method that can calculate the area of a circle
     * @param radius
     */
    public static void areaOfCircle(int radius){
        double area;
        area= Math.round(Math.PI * radius*radius*100)/100.0;
        System.out.println("Circle with a radius "+radius+" cm has an area of "+area);
    }

    /**
     * a method that can calculate the area of a square
     * @param side
     */
//	7. create a method that can calculate the area of a square
    public static void areaOfSquare(int side){
        System.out.println("Square with a side of "+side+" cm has an area of "+(side*side)+" cm²");
    }
//	8. create a method that can convert dollar to TL rate:19.04

    /**
     * a method that can convert dollar to TL rate:19.04
     * @param dollar
     */
    public static void dollarToTL(int dollar){
        System.out.println(dollar+ " dollar is "+(19.04*dollar)+" TL");
    }
}