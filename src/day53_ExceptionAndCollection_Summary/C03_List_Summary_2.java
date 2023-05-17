package day53_ExceptionAndCollection_Summary;

import java.util.Stack;

public class C03_List_Summary_2 {


    public static void main(String[] args) {
        /*
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        arrayList.add("harun");
        linkedList.add("harun");
        arrayList.add("Mehmet");
        linkedList.add("Mehmet");
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(arrayList.get(1));
        System.out.println(linkedList.get(1));
*/
       Stack<Integer> stack=new Stack<>();
        System.out.println(stack.capacity());
        stack.add(25);
        stack.add(50);
        stack.add(75);
        System.out.println(stack.firstElement());
        System.out.println(stack.elementAt(1));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(80);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
