package DynamicProgramming;

public class fabonaciiSeries {
    public static void main(String[] args) {
        System.out.println("Tabulation: "+fibonaciiTabulation(4));
        int DP[] = new int[5];
        System.out.println("Memoization: " + fibonaciiMemoization(4, DP));
    }

    //storing in array without recursion //O(n)
    public static int fibonaciiTabulation(int n){
        int f[] = new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<f.length;i++){
            f[i] = f[i-1]+f[i-2];
        }

        return f[n];

        
    }

    //with recursion, DP, called Memoization //O(n)
    public static int fibonaciiMemoization(int n, int DP[]){
        if(n == 0 || n==1){
            return n;
        }

        if(DP[n] != 0){
            return DP[n];
        }

        DP[n] = fibonaciiMemoization(n-1, DP)+fibonaciiMemoization(n-2, DP);
        return DP[n];
    }
    
}
