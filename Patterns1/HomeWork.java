package Patterns1;

public class HomeWork {
    public static void main(String[] args) {
        // Butterfly pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *
        //  Upper half
        // for(int i=0;i<4;i++){
        //     //star
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=8-(i+1)*2;j>0; j--){
        //         System.out.print(" ");
        //     }
        //     // star
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Bottom half
        // for(int i=4;i>0;i--){
        //     //star
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=8-(i)*2;j>0; j--){
        //         System.out.print(" ");
        //     }
        //     // star
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 0-1 triangle pattern
        // 1 
        // 0 1 
        // 1 0 1 
        // 0 1 0 1 
        // 1 0 1 0 1 
        //logic: if i+j == even then we print 1 else 0
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<i+1;j++){
        //         if((i+j)%2 ==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }System.out.println();
        // }

        // Floyd's triangle pattern
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // int n=1;
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print((n++)+" ");
        //     }System.out.println();
        // }

        // Inverted Half-Pyramid with no's
        // 1 2 3 4 5 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // for(int i=0;i<5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(j+" ");
        //     }System.out.println();
        // }

        // Inverted and rotated half pyramid
        //       *
        //      **
        //     ***
        //    ****
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // Hallow rectangle pattern
        // *****
        // *   *
        // *   *
        // *****
        // int n=4, m=5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0 || i==n-1 || j==0 || j==m-1){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        // }
    }
}
