package src.Recursion.Palindrome;

//Example 1:
//Input: Str =  “ABCDCBA”
//Output: Palindrome
//Explanation: String when reversed is the same as string.
//
//Example 2:
//Input: Str = “TAKE U FORWARD”
//Output: Not Palindrome
//Explanation: String when reversed is not the same as string.



public class PalindromeRecursion {
    public static boolean PalindromeString(String s){
        char[] reversedString =s.toCharArray();
        int i=0;
        int n = s.length()-1;
        while(n>i){
            char temp = reversedString[i];
            reversedString[i] = reversedString[n];
            reversedString[n] = temp;
            i++;
            n--;

        }
        for(int j=0;j<reversedString.length;j++) {
        if(reversedString[j] != s.charAt(j)){
            return false;
        }
        }
        return true;




    }

    public static void main(String[] args) {
        System.out.println("The given string is : " + PalindromeString("ABCBA"));

    }
}
