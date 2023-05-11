package day52_Collections2;

import java.util.*;

public class C05_SetPractice3 {
    public static void main(String[] args) {
        String[] arr = {"Book", "Book", "Notebook", "Pen", "Pencil", "Pen", "Spoon", "Ruler", "Phone", "Mirror", "Phone", "Brush"};
//        System.out.println("arr.length = " + arr.length);


        Set<String> uniqueItemsInMyBag = new HashSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag);

        Set<String> uniqueItemsInMyBag2 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag2);

        Set<String> uniqueItemsInMyBag3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag3);

//        arr = uniqueItemsInMyBag3.toArray(new String[0]);
//        System.out.println("arr.length = " + arr.length);
//        System.out.println(Arrays.toString(arr));
//        Aslinda burada Arrayin size i degistirmedik. Yeni boyutta bir array olusturduk
//        ve arr referansina assign ettik. Altta detayi mevcut


    }
}

/*In Java, arrays have a fixed size once they are initialized. This means that you cannot directly resize an existing
array. However, you can create a new array with a different size and copy the elements from the old array to the new
array.

In the given code snippet, the set1.toArray(new String[0]) statement is used to resize the array. Here's how it works:

set1.toArray() returns an array containing the elements of the set1 HashSet. By default, it returns an array of type Object[].

To resize the array to hold strings (String objects) specifically, we pass a new String array as an argument to toArray().
 In this case, an empty String array new String[0] is passed.

When toArray() is called with an empty array as an argument, it creates a new array of the same size as the HashSet (set1)
 and populates it with the elements from the set. If the HashSet contains more elements than the provided array,
 a new array with a larger size will be created to accommodate all the elements.

The newly created array is then assigned back to the arr variable, effectively "resizing" the array to fit the unique
elements from the HashSet.

Keep in mind that in Java, arrays have a fixed size, so "resizing" an array actually means creating a new array with
a different size and assigning it to the variable that originally held the array.
*/