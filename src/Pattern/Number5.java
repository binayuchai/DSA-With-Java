package src.Pattern;

public class Number5 {

    public static void main(String[] args) {

        //Number 5
        for(int i=5; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Number 6
        for(int i=5; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Number 7
        int n=4;

        for(int i=0; i<=n; i++){
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

// output of Number 5
//
//        *****
//        ****
//        ***
//        **
//        *

//output of Number 6
//
//        12345
//        1234
//        123
//        12
//        1



//output of Number 7
//    *
//   ***
//  *****
// *******
//*********