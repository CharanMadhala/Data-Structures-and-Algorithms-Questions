package VariableAndDataTypes;
// ****
// ****
// ****

public class SquarePattern {
    public static void main(String[] args) {
        printPattern(3, 4);
    }

    public static void printPattern(int i, int j){
        for(int k=0;k<i;k++){
            for(int l = 0;l<j;l++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
