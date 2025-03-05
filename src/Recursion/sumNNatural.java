package src.Recursion;

public class sumNNatural {
    public static int sumOfN(int n){
        if (n == 0) {
            return 0;
        }
        return n + sumOfN(n-1);
    }

    public static void main(String[] args) {

        System.out.println("result " + sumOfN(5));
    }
}
