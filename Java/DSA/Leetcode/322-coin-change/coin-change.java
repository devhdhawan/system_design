class Solution {
    public int solve(int[] coins,int i,int amount,int n,int[][] dp){
       
        if(amount==0)
            return 0;
        if(amount<0)
            return -1;
        if(i>=n)
            return -1;
        
        if(dp[i][amount]!=-1)
            return dp[i][amount];
        
        int take1=-1;
        int take2=-1;
        int nottake=0;

        if(amount>=coins[i]){
            take1=1+solve(coins,i+1,amount-coins[i],n,dp);
            take2=1+solve(coins,i,amount-coins[i],n,dp);
            
        }
        nottake=solve(coins,i+1,amount,n,dp);
        // System.out.println(take1+" "+take2+" "+nottake);
        if(take1==0 && take2==0 && nottake==-1)
            return -1;
        
        if(take1==0)
            take1=Integer.MAX_VALUE;
        
        if(take2==0)
            take2=Integer.MAX_VALUE;
        
        if(nottake==-1)
            nottake=Integer.MAX_VALUE;
        

        return dp[i][amount]=Math.min(take1,Math.min(take2,nottake));
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        int n=coins.length;
        int[][] dp = new int[n+1][amount+1];

       
        for(int i=1;i<=amount;i++){
            dp[0][i]=Integer.MAX_VALUE;
        }

        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                
                if(j==coins[i-1]){
                    dp[i][j]=1;
                }
                else if(j>coins[i-1]){
                    if(dp[i][j-coins[i-1]]==-1){
                        dp[i][j]=dp[i-1][j];
                        if(dp[i-1][j]==Integer.MAX_VALUE)
                            dp[i][j]=-1;
                    }
                    else{
                        dp[i][j]=1+dp[i][j-coins[i-1]];
                        if(dp[i-1][j]!=-1)
                            dp[i][j]=Math.min(dp[i][j],dp[i-1][j]);
                    }
                }else{
                    if(dp[i-1][j]==Integer.MAX_VALUE)
                        dp[i][j]=-1;
                    else
                        dp[i][j]=dp[i-1][j];
                }

            }
            
        }
        
        
        return dp[n][amount];
    }
}