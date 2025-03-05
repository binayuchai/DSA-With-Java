package src.BasicMaths;


//Example 1:
//Input:N = 12345
//Output:54321
//Explanation: The reverse of 12345 is 54321.
//Example 2:
//Input:N = 7789
//Output: 9877
//Explanation: The reverse of number 7789 is 9877.
//Note: If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

public class ReverseNumber {
    public static void main(String[] args) {
        int N = 9877;
        int reverse = 0;
        while(N > 0){   // Log10(N)
            int num = N % 10;
            reverse = num + reverse*10;
            N = N / 10;

        }
        System.out.println("Reversed Number "  + "has " + reverse + " digits");

    }
}
