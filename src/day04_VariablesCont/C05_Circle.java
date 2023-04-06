package day04_VariablesCont;

public class C05_Circle {
    public static void main(String[] args){
        //declare variables
        //PI, radius, area, perimeter
        double r = 1.0;
        double PI = 3.14;

        double area = PI*r*r;   //alani hesaplayip area icine yazar
        double perimeter = 2 * PI * r;

        System.out.println("PI = " + PI);
        System.out.println("r = " + r);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}

/*
    Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
        PI, radius, diameter, area, perimeter

        Hints: 	PI = 3.14
        area = radius * radius * PI  // radius= cap  area = alan perimeter = cevre
        Perimeter = diameter * PI

 */