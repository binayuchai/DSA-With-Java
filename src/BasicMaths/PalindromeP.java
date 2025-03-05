package src.BasicMaths;

public class PalindromeP {
    public static boolean palindromeNumber(int n){
        int rev = 0;
        int check = n;
        while(check > 0){
            int num = check % 10;
            rev = rev*10 + num;
            check = check / 10;
        }
        if(rev == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       boolean result = palindromeNumber(12021);
        System.out.println("Result is: " + result);
    }
}
