package src.BasicMaths.Divisors;

public class bruteForce {
    public static int[] divisorNumbers(int n){
        int[] count = new int[n];
        int j=0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                count[j++] = i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
      int[] divisors = divisorNumbers(36);
        System.out.println("The Divisors are: ");
      for(int i=0; i<divisors.length;i++){
          System.out.println(i);
      }
      //free dynaimcally alloted memory
        divisors = null;

    }
}
