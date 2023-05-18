package day57_JavaReview2;

import java.util.Arrays;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.util.Arrays.sort;
public class C02_ImportStatements {
    public static void main(String[] args) {
        String[] group ={"Hans","Sam","Tony","Jony","Hergel","Frank"};

        Arrays.sort(group);
        System.out.println(Arrays.toString(group));
        sort(group);

        System.out.println("Math.PI = " + Math.PI);
        System.out.println("PI = " + PI);   // static import enables us to call methods or variables without the classname
        System.out.println("pow(2,5) = " + pow(2, 5));

        // RestAssured , HamcrestMatchers

    }
}
