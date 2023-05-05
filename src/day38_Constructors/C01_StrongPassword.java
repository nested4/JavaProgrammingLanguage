package day38_Constructors;

public class C01_StrongPassword {
    public static void main(String[] args) {
        String password = "Ab1234567>";
        System.out.println("isStrongPassword(password) = " + isStrongPassword(password));
    }

    public static boolean isStrongPassword(String password) {
        // Password must be at least have 8 characters long, and should not contain space
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // upper case
        boolean r3 = false; // lower case
        boolean r4 = false; // digit
        boolean r5 = false; // special char

        char[] chars = password.toCharArray();

        for (char eachChar : chars) {
            if (Character.isUpperCase(eachChar)) {
                r2 = true;
            } else if (Character.isLowerCase(eachChar)) {
                r3 = true;
            } else if (Character.isDigit(eachChar)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }

        boolean isStrongPassword = r1 && r2 && r3  && r4  && r5;
        return  isStrongPassword;

    }
}
/*
 Write a method that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space +
        1.2 PassWord should at least contain one upper case letter +
        1.3 PassWord should at least contain one lower case letter +
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit +
 */