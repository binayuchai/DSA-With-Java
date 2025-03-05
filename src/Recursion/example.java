package src.Recursion;


// using backtracking(backward recursion)
public class example {
    static void print(int i,int n){
         if(i < 1) return;
        print(i-1,n);
        System.out.println(i); // 4, 3,2, 1

    }
    static void print2(int j,int n){

        if(j > n) return;
        print2(j+1,n);
        System.out.println(j);

    }
    public static void main(String[] args) {
        int n = 4;
//        print(n,n);
        print2(1,n);
    }
}
