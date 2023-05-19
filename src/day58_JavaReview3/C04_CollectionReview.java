package day58_JavaReview3;

import java.util.*;

public class C04_CollectionReview {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println(set);

        Integer[] array = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

//        List<String> name= null;
//        System.out.println("name.size() = " + name.size());  //NullPointerException

        List<String> alayI = new Stack<>();
        alayI.addAll(Arrays.asList("Hans", "Sam", "Tony", "Jony", "Hergel", "Frank"));
        System.out.println("alayI = " + alayI);
//        alayI.pop()

        System.out.println("((Stack)alayI).pop() = " + ((Stack) alayI).pop());

        System.out.println("alayI = " + alayI);

        System.out.println("----------------------------------------");

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Hans", "Sam", "Tony", "Jony", "Hergel", "Frank"));

//        names.poll()
        System.out.println("((Queue)names).poll() = " + ((Queue) names).poll());
        System.out.println("((LinkedList)names).poll() = " + ((LinkedList) names).poll());

        System.out.println("names = " + names);


    }
}
