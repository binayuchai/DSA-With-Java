package src.BasicMaths;

public class ArmstrongNumber {
    public static boolean Armstrong(int n) {
        int num = n;
        int check = 0;
        while(num > 0){
            int rem = num % 10;
            check = (int) (Math.pow(rem,3)) +check ;
            num = num / 10;

        }
        return check == n;
    }
    public static void main(String[] args) {
       boolean result = Armstrong(152);
        System.out.println("The number is "+ (result ? "Armstrong" : "Not Armstrong"));
    }
}
