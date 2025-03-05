package src.Pattern;

public class Number8 {
    public static void main(String[] args) {
        int n=4;

        for(int i=n; i>=0; i--){
            for(int j=0;j<=n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<(2*i+1); k++){
                System.out.print("*");
            }
            for(int j=0;j<=n-1-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}


// output of Number 8

//           *********
//            *******
//             *****
//              ***
//               * 