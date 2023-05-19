package day58_JavaReview3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C05_IterablePractice {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println(list);
        //remove all the elements less than 4

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        Iterator<Integer> iter = list2.iterator();

        while (iter.hasNext()) {
            if (iter.next() < 4) {
                iter.remove();
            }
        }

        System.out.println(list2);
        System.out.println("---------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        list3.removeIf(a -> a > 3);
        System.out.println(list3);


    }
}
