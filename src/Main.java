package src;
import src.CollectionJava.ArrayListPractice;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        //

        ArrayList<Integer> al = new ArrayList<Integer>();

        int arr[] = new int[]{1,2,3,4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer,String> h = new Hashtable();

        v.addElement(1);
        v.addElement(2);


        h.put(1,"arjun");
        h.put(2,"uchai");


        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

    }
}