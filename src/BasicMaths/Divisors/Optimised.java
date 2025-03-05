package src.BasicMaths.Divisors;

import java.util.ArrayList;
public class Optimised {
    public static ArrayList<Integer> divisorNumbers(int n){
        ArrayList<Integer> num = new ArrayList<Integer>();
        int squareOfN = (int)Math.sqrt(n);
        for(int i=1;i<=squareOfN;i++){
            if(n % i == 0){
                num.add(i);
                if(i != n/i){
                    num.add(n/i);
                }
            }


        }
        return num;
    }
    public static void main(String[] args) {
        ArrayList<Integer> divisors = divisorNumbers(36);
        System.out.println("The Divisors are: ");
        for(int divisor: divisors){
            System.out.println(divisor);
        }
    }
}
