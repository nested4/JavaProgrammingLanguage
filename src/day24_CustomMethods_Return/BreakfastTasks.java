package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("cydeo", "school"); //

        initials("Ali Topcu");

        System.out.println("----------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------");

        System.out.println(nameOfMonth(11));

        for (int i = 1; i <= 12; i++) {
            System.out.println(nameOfMonth(i));
        }

        for (int i = 0; i <=7 ; i++) {
            nameOfDay(i);
        }

    }

    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);


    }

    public static void initials(String FullName) {
        String[] nameSurname = FullName.split(" ");
        String initial = nameSurname[0].charAt(0) + "." + nameSurname[1].charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
//    public static void nameOfMonth(int number) {  // 95
//
//        String name = "";
//
//        if (number >= 1 && number <= 12) {
//
//            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
//                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
//                    : (number == 11) ? "Nov" : "Dec";
//
//        } else {
//            name = "Invalid";
//        }
//
//        System.out.println("Month name = " + name);
//
//    }
    public static String nameOfMonth(int number) {  // 95

        String name = "";

        switch (number) {
            case 1:
                name += "Jan";
                break;
            case 2:
                name += "Feb";
                break;
            case 3:
                name += "Mar";
                break;
            case 4:
                name += "Apr";
                break;
            case 5:
                name += "May";
                break;
            case 6:
                name += "Jun";
                break;
            case 7:
                name += "Jul";
                break;
            case 8:
                name += "Aug";
                break;
            case 9:
                name += "Sep";
                break;
            case 10:
                name += "Oct";
                break;
            case 11:
                name += "Nov";
                break;
            case 12:
                name += "Dec";
                break;

            default: {

                name = "Invalid ";
            }

        } return ("Month name : " + name);
    }




    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String name = "";

        if (number >= 1 && number <= 7) {

            name = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thu" : (number == 5) ? "Fri"
                    : (number == 6) ? "Sat" : "Sun";

        } else {
            name = "Invalid ";
        }

        System.out.println("Day name = " + name);

    }


    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number,int year) {


    }
    public static void ageGroups(int age){

    }


    // ageGroups(int age)


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


                        */
