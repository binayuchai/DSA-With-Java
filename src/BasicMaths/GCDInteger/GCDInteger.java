package src.BasicMaths.GCDInteger;

import static java.lang.Math.*;

//Brute Force Approach
//Time Complexity: O(N^2)
// Space Complexity: O(N + M + N or M)
public class GCDInteger {
    public static int GCDResult(int n1,int n2) {
        int[] n1Factor = new int[n1];
        int[] n2Factor = new int[n2];
        int[] commonFactor = new int[min(n1,n2)];
        int N1=0;
        int N2 = 0;
        int N3 = 0;
        int maxGCDNumber = 0;

        for(int i=1;i<=n1;i++){        // O(n)
            if((n1 % i) == 0){
                n1Factor[N1++] = i;
            }
        }


        for(int j=1;j<=n2;j++){      // O(n)
            if((n2 % j) == 0){
                n2Factor[N2++] = j;
            }
        }


        int compareSizeOfN1 = 0;
        //Minimizing the size
        for(int i=0; i<n1Factor.length;i++){    // O(n)
            if(n1Factor[i] == 0){
                compareSizeOfN1 = i;
                break;
            }
        }
        int compareSizeOfN2 = 0;

        for(int i=0; i<n2Factor.length;i++){ // O(n)
            if(n2Factor[i] == 0){
                compareSizeOfN2 = i;
                break;
            }
        }

        for(int i=0; i<compareSizeOfN1;i++){    // O(n^2)
           for(int j=0; j<compareSizeOfN2;j++){
               if(n1Factor[i] == n2Factor[j]){
                   commonFactor[N3++] = n1Factor[i];
                   break;
               }
           }
        }

        for (int j : commonFactor) {  // O(n)
            if (maxGCDNumber < j) {
                maxGCDNumber = j;
            }
        }

    return maxGCDNumber;
    }
    public static void main(String[] args) {
       int result = GCDResult(20,15);
        System.out.println("Result is:" + result);
    }
}
