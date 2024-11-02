package DynamicProgramming;

public class knapsack01 {
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println("Resursion : "+ knapsackResursion(val, wt, W, val.length-1));

        //using mamoization
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("Memoization : "+ knapsackMemoization(val, wt, W, val.length-1, dp));

        System.out.println("DP Array: ");
        System.out.println("N/W 0  1  2  3  4  5  6  7");
        for(int i=0;i<dp.length;i++){
            System.out.print(i+"  ");
            for(int j=0;j<dp[i].length;j++){
                if(dp[i][j]==0){
                    System.out.print(" "+dp[i][j]+" ");
                }
                else{    
                    System.out.print(dp[i][j]+" ");
                }
            }System.out.println();
        }


        
    }

    //memoization
    public static int knapsackMemoization(int val[], int wt[], int W, int i, int dp[][]){

        if(W ==0 || i==0){
            dp[i][W] = 0;
            return 0;
        }
        if(dp[i][W] != -1){
            // System.out.println("Hit for : i= " + i +" W: " + W);
            return dp[i][W];
        }

        if(wt[i]<=W){//valid case
            //include
            int ans1 = val[i] + knapsackMemoization(val, wt, W-wt[i], i-1, dp);
            //exclude
            int ans2 = knapsackMemoization(val, wt, W, i-1,dp);
            dp[i][W] = Math.max(ans1,ans2);
            return dp[i][W];
        }
        else{
            dp[i][W] = knapsackMemoization(val, wt, W, i-1,dp);
            return dp[i][W];
        }

    }
    //recursion
    public static int knapsackResursion(int val[], int wt[], int W, int i){

        if(W ==0 || i==0){
            return 0;
        }

        if(wt[i]<=W){//valid case
            //include
            int ans1 = val[i] + knapsackResursion(val, wt, W-wt[i], i-1);
            //exclude
            int ans2 = knapsackResursion(val, wt, W, i-1);
            return Math.max(ans1,ans2);
        }
        else{
            return knapsackResursion(val, wt, W, i-1);
        }

    }
}
