package Patterns1;

public class ClassSession {
    public static void main(String[] args) {

        // A 
        // B C 
        // D E F 
        // G H I J
        char symbl ='A';
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){ 
                System.out.print((char)(symbl++)+" ");
            }System.out.println();
        }

        // *
        // **
        // ***
        // ****
        // for(int i=0;i<4;i++){
        //     for(int j=0; j<i+1;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // ****
        // ***
        // **
        // *
        // for(int i=0;i<4;i++){
        //     for(int j=4-i; j>0;j--){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j +" ");
        //     }System.out.println();
        // }

    }
}
