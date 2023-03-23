package day14_NestedWhileDoWhile.day18_CustomMethods;


public class C03_CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        System.out.println("---------------------------");
        ageOfPerson(1995);
        ageOfPerson(2000);
        ageOfPerson(2005);

        System.out.println("---------------------------");
        printNumbers(60,50);

    }

//     a function that can check if a number is odd number or even number

    /**
     * a function that can check if a number is odd number or even number
     *
     * @param number
     */
    public static void oddOrEven(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is an even number");
        else
            System.out.println(number + " is an odd number");
    }

    //     a method that can display the age of the person from the birthYear

    /**
     * a method that can display the age of the person from the birthYear
     *
     * @param birthYear
     */
    public static void ageOfPerson(int birthYear) {
        int age = 2023 - birthYear;
        System.out.println("Your age is " + age);
    }


//     a method that can print all the numbers between X and Y

    /**
     * a method that can print all the numbers between x and y
     *
     * @param x
     * @param y
     */
    public static void printNumbers(int x, int y) {
        for (int i = x + 1; i<y;i++){
            System.out.print(i+" ");
        }
    }


}

