// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class sudoku {
    
    public static boolean isSafe(int[][] sudoku, int row, int col, int num){
        //horizaontally
        for(int i=0;i<sudoku.length;i++){
            if(sudoku[i][col]==num){
                return false;
            }
        }
        //vertically
        for(int i=0;i<sudoku[0].length;i++){
            if(sudoku[row][i]==num){
                return false;
            }
        }
        //in cell
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==num){
                return false;
            }
            }
        }
        
        return true;

    }
    public static int safeNum(int[][] sudoku, int row, int j){
        for(int i=1;i<=9;i++){
            if(isSafe(sudoku,row,j,i)){
                return i;
            }
        }
        
        return 0;
    }
    
    public static boolean solveSudoku(int[][] sudoku, int row){
        //base case
        if(row==sudoku.length){
            return true;
        }
        
        for(int i=0;i<sudoku[0].length;i++){
            if(sudoku[row][i]==0){
                if(safeNum(sudoku, row,i)!=0){
                    int num = safeNum(sudoku, row,i);
                    sudoku[row][i] = num;
                }
                // else{
                //     return;
                // }
                
            }
            
        }
        
        solveSudoku(sudoku, ++row);
        
        return false;
    }
    
    public static void printArray(int[][] sudoku){
        for(int i=0;i<sudoku.length;i++){
            for(int j=0;j<sudoku[0].length;j++){
                System.out.print(sudoku[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoku = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        
        if(solveSudoku(sudoku, 0)){
            System.out.println("Solution exist");
            printArray(sudoku);
        }else{
            System.out.println("Solution doesn't exist");
            printArray(sudoku);
        }   
        
        
    }
}