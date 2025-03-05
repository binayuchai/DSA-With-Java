package src.BasicMaths.GCDInteger;

//Time complexity: O(n)
public class Approach2 {
    public static int GCDResult(int n1,int n2) {
       int gcd = 1;
       for(int i=1; i<=Math.min(n1,n2);i++){
           if(n1 % i == 0 && n2 % i == 0){
               gcd = i;
           }

    }
       return gcd;
    }


        public static void main(String[] args) {
        int result = GCDResult(20,15);
        System.out.println("Result is:" + result);
    }
}
