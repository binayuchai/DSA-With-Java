package src.CollectionJava;

import java.util.*;

public class PriorityQueueP {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        //adding item to queue
        pQueue.add("First");
        pQueue.add("Third");
        pQueue.add("Second");
        System.out.println(pQueue);


        // Printing the top element of PQ
        System.out.println(pQueue.peek());


        //Printing the top element and removing it

        System.out.println(pQueue.poll());

        //printing the top element of PQ


        System.out.println(pQueue);
    }
}
