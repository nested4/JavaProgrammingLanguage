package day08_ScannerAndOperators;

public class C02_BirthDay {

    public static void main(String[] args) {

        String name = "John";
        int birthDay = 23;
        String monthOfBirth = "April";
        int birthYear = 1990;

        //John was born on April/23/1990
        System.out.println(name + " was born on " + monthOfBirth + "/" + birthDay + "/" + birthYear);

        //John was born on "April\23\1990"
        //John was born on "April\23\1990"
        System.out.println(name + " was born on \"" + monthOfBirth + "\\" + birthDay + "\\" + birthYear + "\"");

        /*
        escape chars
        \n
        \t
        \"
        \\
        * */

    }
}

/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 23
			 	    Month = "April"
			 	    birthYear = 1990;
                //  date convention 10/15/2020

			 	output:
			 	1.	John was born on April/23/1990
			 	2.	John was born on "April\23\1990"

 */