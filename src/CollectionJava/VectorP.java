package src.CollectionJava;
import java.util.*;
public class VectorP {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i=1;i<=5;i++){
            v.add(i);
        }
        System.out.println(v);

        v.remove(3);
        for(int i=0; i<v.size();i++){
            System.out.print(v.get(i) + " ");
        }

    }
}
