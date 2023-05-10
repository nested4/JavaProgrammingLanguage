package day51_Collection_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        List<String> letters = new LinkedList<>();
        letters.add("K");
        letters.add("R");
        letters.add("A");
        letters.add("F");
        letters.add("T");
        letters.add("T");
        letters.add("E");
        letters.add("C");
        letters.add("H");
        System.out.println("letters.indexOf(\"R\") = " + letters.indexOf("R"));
        System.out.println("letters.indexOf(\"T\") = " + letters.indexOf("T"));
        System.out.println("letters.lastIndexOf(\"T\") = " + letters.lastIndexOf("T"));
        System.out.println(letters);
        letters.add("S");
        System.out.println(letters);
        letters.set(3,"L");
        System.out.println(letters);
        letters.add(4,"L");
        System.out.println(letters);

        List<String> target = new LinkedList<>();
        target.addAll(Arrays.asList("R","T","L","Q"));

        System.out.println(target);
        System.out.println("letters.containsAll(target) = " + letters.containsAll(target));
        System.out.println("letters.retainAll(target) = " + letters.retainAll(target));
        System.out.println(letters);
        System.out.println("letters.removeAll(target) = " + letters.removeAll(target));
        System.out.println(letters);


    }
}
