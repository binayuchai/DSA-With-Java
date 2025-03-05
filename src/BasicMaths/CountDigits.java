package src.BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int N = 778934;
        int count=0;
        while(N > 0){  // takes log10(N) iteration
            N  = N  / 10;
            count++;
        }
        System.out.println("Number "  + "has " + count + "digits");
    }
}
