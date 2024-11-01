package DynamicProgramming;

public class fabonaciiSeries {

    //storing in array without recursion
    public static int fibonaciiNo(int n){
        int f[] = new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<f.length;i++){
            f[i] = f[i-1]+f[i-2];
        }

        return f[n];

        
    }

    //with recursion, DP, called Memoization
    public static int fibonaciiDP(int n, int DP[]){
        if(n == 0 || n==1){
            return n;
        }

        if(DP[n] != 0){
            return DP[n];
        }

        DP[n] = fibonaciiDP(n-1, DP)+fibonaciiDP(n-2, DP);
        return DP[n];
    }
    public static void main(String[] args) {
        System.out.println(fibonaciiNo(4));
        int DP[] = new int[5];
        System.out.println("With DP: " + fibonaciiDP(4, DP));
    }
}
