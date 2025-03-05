package src.Recursion.ReverseArray;
import java.util.*;
//Time Complexity: O(n)
//Space Complexity: O(1)
public class reverse1 {

    public static void resultArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void resultCollectionArray(Integer[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    
    public static void reverseNumber(int[] arr,int high,int low){
        if(high <= low){
         resultArray(arr);
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverseNumber(arr,high-1,low+1);

    };

    // Using Java Collection
    public static void reverseArray(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));

    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        Integer[] b = {3,4,5};

        System.out.println("Initial Order is: ");
        resultArray(a);
        resultCollectionArray(b);

        System.out.println("Reverse order is : ");

        reverseNumber(a,(a.length-1),0);
        // Using Collection Framework
        reverseArray(b);
        resultCollectionArray(b);



    }
}
