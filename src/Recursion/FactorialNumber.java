package src.Recursion;

public class FactorialNumber {
    public static int factorialNum(int n){
        //using functional way to solve this
        if(n == 1){
            return 1;
        }

        return n * factorialNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of number is: " + factorialNum(5));
    }
}
