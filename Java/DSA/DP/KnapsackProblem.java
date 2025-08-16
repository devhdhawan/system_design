package DSA.DP;
// Knapsack Problem
// This implementation finds the maximum value that can be put in a knapsack of capacity W.
// Time Complexity: O(n * W) where n is the number of items and W is the capacity of the knapsack


public class KnapsackProblem {
    // Using Memoization
    // Time Complexity: O(n * W)
    // Space Complexity: O(n * W) for the dp array
    public static int knapsackMemo(int W,int val[],int wt[],int i,int n,int[][] dp){
        if(i==n)
            return 0;
        if(W<=0)
            return 0;
        if(dp[i][W]!=-1)
            return dp[i][W];
        
        int Take=0;
        if(W>=wt[i]){
            Take=val[i]+knapsackMemo(W-wt[i],val,wt,i+1,n,dp);
        }
        int notTake=knapsackMemo(W,val,wt,i+1,n,dp);
        
        
        return dp[i][W]=Math.max(Take,notTake);
    }

    // Using Dynamic Programming
    // Time Complexity: O(n * W)
    // Space Complexity: O(n * W) for the dp array
    public static int knapsackDP(int W, int val[], int wt[]) {
        // code here
        int[][] dp = new int[val.length+1][W+1];
        int ans=0;
        for(int i=0;i<=W;i++)
            dp[0][i]=0;
        for(int i=1;i<=val.length;i++){
            for(int j=0;j<=W;j++){
                
                if(j<wt[i-1])
                    dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                    ans=Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans;
    }

    // Using Space Optimized Dynamic Programming
    // Time Complexity: O(n * W)
    // Space Complexity: O(W) for the dp array
    // This approach reduces the space complexity by using a single array instead of a 2D
    public static int knapsackDPSpaceOpt(int W, int val[], int wt[]) {
        // code here
        int[] dp = new int[W+1];
        
        for(int i=1;i<=val.length;i++){
            for(int j=W;j>=wt[i-1];j--){
                
                dp[j]=Math.max(dp[j],val[i-1]+dp[j-wt[i-1]]);
                
            }
        }
        
        return dp[W];
    }

    public static void main(String[] args) {
        int W = 50;
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        
        // Using Memoization
        int[][] dp = new int[val.length][W + 1];
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1; // Initialize dp[i][j] to -1
            }
        }
        System.out.println("Maximum value in Knapsack (Memoization): " + knapsackMemo(W, val, wt, 0, val.length, dp));
        
        // Using Dynamic Programming
        System.out.println("Maximum value in Knapsack (DP): " + knapsackDP(W, val, wt));
        
        // Using Space Optimized Dynamic Programming
        System.out.println("Maximum value in Knapsack (Space Optimized DP): " + knapsackDPSpaceOpt(W, val, wt));
    }
}
