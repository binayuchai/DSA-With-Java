package src.CollectionJava;

import java.util.*;

public class StackP {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Arjun");
        stack.push("Uchai");

        //Iterator for stack
        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        stack.pop();

        //Iterator for stack
        itr = stack.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }


    }
}
