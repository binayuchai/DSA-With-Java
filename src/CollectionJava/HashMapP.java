package src.CollectionJava;
import java.util.*;
public class HashMapP {
    public static void main(String[] args) {
        //Creating hashmap
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Arjun");
        hm.put(2,"Uchai");
        hm.put(3,"Thakuri");

        System.out.println("Value of 1 is: " + hm.get(1));

        for(Map.Entry<Integer,String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());


    }
}
