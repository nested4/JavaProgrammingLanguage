package day52_Collections2;

import java.util.*;

public class C02_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQue= new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(20,150,200,40,120)); // random order
        priorityQue.add(30);
        System.out.println("priorityQue = " + priorityQue);


        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(20,150,200,40,120)); // preserve insertion order
        arrayDeque.add(30);

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(20,150,200,40,120)); // preserve insertion order
        linkedList.add(30);
        System.out.println("linkedList = " + linkedList);

        System.out.println("---------------------------------------------");

//        priorityQue.get(1)
//        arrayDeque.get(2)
        ((List)linkedList).get(1);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println(priorityQue);
        System.out.println("priorityQue.poll() = " + priorityQue.poll()); // first element will be removed
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());

        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println(arrayDeque);
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println(arrayDeque);

        System.out.println("linkedList.poll() = " + linkedList.poll());  //FIFO First in First Out
        System.out.println(linkedList);

//        System.out.println("((List)priorityQue).get(1) = " + ((List) priorityQue).get(1));  // runtime Error


    }
}
