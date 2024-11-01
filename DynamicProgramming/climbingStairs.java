package DynamicProgramming;
import java.util.Arrays;

public class climbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("recursion: "+ clmbStrRecursion(n));
        System.out.println("Tabulation: "+clmbStrTabulation(n));
        int DP[] = new int[n+1];
        Arrays.fill(DP, -1);
        System.out.println("Memoization: " + clmbStrMemoization(n, DP));
    }

    //storing in array without recursion //O(n)
    
    public static int clmbStrTabulation(int n){
        int f[] = new int[n+1];
        f[0]=1;
        
        for(int i=1;i<f.length;i++){
            f[i] = f[i-1]+(i-2<0? 0 : f[i-2]);
        }

        return f[n];

        
    }

    //with recursion, DP, called Memoization //O(n)
    public static int clmbStrMemoization(int n, int DP[]){
        if(n == 0 ){
            return 1;
        }
        if(n < 0 ){
            return 0;
        }

        if(DP[n] != -1){
            return DP[n];
        }

        DP[n] = clmbStrMemoization(n-1, DP)+clmbStrMemoization(n-2, DP);
        return DP[n];
    }

    //with recursion //O(2^n)
    public static int clmbStrRecursion(int n){
        if(n == 0 ){
            return 1;
        }
        if(n < 0 ){
            return 0;
        }

        
       return clmbStrRecursion(n-1)+clmbStrRecursion(n-2);
       
    }
}
