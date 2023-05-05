package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //System.out.println("list.size() = " + list.size());
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(10);


        ArrayList<Integer> list1 = new ArrayList<>();
        list.addAll(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1));

        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------");

        list2.removeAll(Arrays.asList(1,2,3));
        System.out.println("list2 = " + list2);

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1));
        System.out.println("list2 = " + list2);
        System.out.println("----------------------------------");

        list2.retainAll(Arrays.asList(1,2,3));
        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "Full Stack Automation Engineer", "Java Developer"
                , "SDET", "Software Development Engineer In Test", "Test Engineer", "Quality Assuarance Engineer",
                "QA Automation Engineer"));
        System.out.println("jobTitles = " + jobTitles);

    }
}
