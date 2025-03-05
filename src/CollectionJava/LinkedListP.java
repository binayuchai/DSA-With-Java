package src.CollectionJava;

import java.util.LinkedList;

public class LinkedListP {


    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //appending new element
        for(int i=1;i<=5;i++){
            ll.add(i);
        }
        System.out.println(ll);

        ll.remove(3);
        for(int i=0; i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }

    }
}
