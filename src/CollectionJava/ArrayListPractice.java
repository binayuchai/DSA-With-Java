package src.CollectionJava;

import java.util.*;


public class ArrayListPractice {



    public static void main(String[] args) {
        //Declaring the ArrayList with initial size n

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=1; i<=5; i++){
            al.add(i);
        }
        System.out.println(al);

        //Remove element at index 4
        al.remove(4);


        System.out.println(al);

        //Printing the element
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }

    }

}
