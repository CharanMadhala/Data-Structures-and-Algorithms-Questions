// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//n queen problem
class nQueensProblem {
    public static boolean isSafe(char[][] board, int row, int col){
        if(row==0){
            return true;
        }
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // right diagonal
        for(int i=row-1, j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char[][] board, int row){
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        
        //loop thought each col in given row
        for(int i=0;i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i]='Q';
                nQueens(board, ++row);
                // board[row][i]='X';
                    

            }
        }
        
    }
    public static void printBoard(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
                
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        // printBoard(board);
        nQueens(board, 0);
        printBoard(board);
    }
}