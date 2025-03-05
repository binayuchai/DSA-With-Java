package src.Pattern;

public class Number10 {

//    public static void number19(){
//        int n = 4;
//        for (int i = 0; i <= 4; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print("*");
//            }
//            for (int s = 0; s < (2 * i); s++) {
//                System.out.print(" ");
//            }
//            for (int k = 4; k >= i; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <= 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int s = (2*n)-(2*i); s > 0; s--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    public static void number20() {
//        int n = 5;
//        int space = 2*n - 2;
//        for(int i=1; i<=(2*n)-1; i++){
//            int stars = i;
//            if(i >n){
//                stars = 2*n - i;
//            }
//            for(int j=1;j<=stars;j++){
//                System.out.print("*");
//            }
//
//            for(int s=1;s<=space;s++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=stars;k++){
//                System.out.print("*");
//            }
//            if(i < n){
//                space -=2;
//            }else{
//                space +=2;
//            }
//            System.out.println();
//
//        }
//    }

    // Number 21
//    public static void number21() {
//        int n=3;
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=n; j++){
//                if(i==0 || j==0 || i==n || j==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
    // Number 22

    public static void number22() {
        int n=6;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0 || i==n || j==n){
                    System.out.print(4);
                } else if (i==1 || j==1 || i==n-1 || j==n-1) {
                    System.out.print(3);

                }
                else if(i==2 || j==2 || i==n-2 || j==n-2){
                    System.out.print(2);

                }
                else{
                    System.out.print(1);

                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
//        int n = 4;
//
//        // Number 10
//        for(int i=0; i<=n;i++){
//            for(int j=0;j<=i; j++){
//                if((i+j)%2 == 0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//
//        // Number 11
//
//        for(int i=1; i<=n; i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int k=1; k<=((2*n)-2*i);k++){
//                System.out.print(" ");
//
//            }
//            for(int l=i;l>=1;l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }
//
//        //Number 12
//        int increment = 1;
//        for(int i=0; i<=4; i++){
//            for(int j=0;j<=i; j++){
//                System.out.print(increment + " ");
//                increment++;
//
//            }
//            System.out.println();
//        }
//
//        // Number 14
//
//        for(int i=0; i<=4; i++){
//            char incAlpha = 65;
//            for(int j=0;j<=i; j++){
//                System.out.print(incAlpha + " ");
//                incAlpha++;
//
//            }
//            System.out.println();
//        }
//
//        //Number 16
//        for(int i=0; i<=4; i++){
//            char incAlpha = (char) ('A' + i);
//            for(int j=0;j<=i; j++){
//                System.out.print(incAlpha);
//
//            }
//
//            System.out.println();
//        }
//
//        //Number 17
//        int loop = 3;
//        for(int i=0; i<=loop;i++){
//            for(int j=0;j<=(loop-i);j++){
//                System.out.print(" ");
//            }
//            int mid = ((2*i)+1)/2;
//            char trackAlpa = 'A';
//            for(int k='A';k<='A'+mid;k++){
//                System.out.print((char)k);
//                trackAlpa = (char)k;
//            }
//            for(int l=trackAlpa-1;l>='A';l--){
//                System.out.print((char)l);
//
//            }
//
//            for(int j=0;j<=(loop-i);j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//
//        //Number 18
//        for(int i =0; i<5; i++){
//            for(char j = (char) ('E'-i); j<='E'; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        number22();







    }
}


//output of number 10

//        1
//        01
//        101
//        0101
//        10101


// output of  number 11

//        1      1
//        12    21
//        123  321
//        12344321


// output of number 12

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

// output of number 13

//A
//A B
//A B C
//A B C D
//A B C D E

//output of number 17
//
//             A
//            ABA
//           ABCBA
//          ABCDCBA




//Number 18
//E
//DE
//CDE
//BCDE
//ABCDE


//  Number 19
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********


//         Number 20
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//

//        Number 21
//        ****
//        *  *
//        *  *
//        ****


// Number 22


//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444