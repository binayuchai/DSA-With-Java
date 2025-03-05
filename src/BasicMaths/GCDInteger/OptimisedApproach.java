package src.BasicMaths.GCDInteger;

import static java.lang.Math.min;

public class OptimisedApproach {
    public static int GCD(int n1,int n2) {

        for(int i=min(n1,n2);i>0;i--){
            if(n1 % i == 0 && n2 % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int result = GCD(20,15);
        System.out.println("GCD is: "+ result);

    }
}
