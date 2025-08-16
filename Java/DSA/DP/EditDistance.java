package DSA.DP;
// Edit Distance
// This implementation finds the minimum number of operations required to convert one string into another.
// Time Complexity: O(n1 * n2) where n1 and n2 are the lengths of the two strings
// Space Complexity: O(n1 * n2) for the dp array

public class EditDistance {
    public int editDistanceMemo(String word1,String word2,int n1,int n2,int[][] dp){
        if(n1<=0)
            return n2; // If word1 is empty, we need n2 operations to convert it to word2
        
        if(n2<=0)
            return n1;  // If word2 is empty, we need n1 operations to convert word1 to an empty string
        
        if(dp[n1][n2]!=-1)
            return dp[n1][n2];
        
        if(word1.charAt(n1-1)==word2.charAt(n2-1))
            return dp[n1][n2]=editDistanceMemo(word1,word2,n1-1,n2-1,dp);
        
        return dp[n1][n2]=1+
    Math.min(
            editDistanceMemo(word1,word2,n1-1,n2-1,dp), // Replace operation
        Math.min(
            editDistanceMemo(word1,word2,n1-1,n2,dp), // Delete operation
            editDistanceMemo(word1,word2,n1,n2-1,dp)) // Insert operation
            );

    }

    public int editDistanceDP(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        
        int[][] dp = new int[n1+1][n2+1];
        
        for(int i=0;i<=n1;i++){
            dp[i][0]=i; // If word2 is empty, we need i operations to convert word1 to an empty string
        }
        for(int i=0;i<=n2;i++){
            dp[0][i]=i; // If word1 is empty, we need i operations to convert it to word2
        }

        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]; // If characters match, no operation is needed
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));// Replace, Delete, Insert operations
                }
                
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        EditDistance ed = new EditDistance();
        String word1 = "horsepower";
        String word2 = "roscolour";

        // Using Memoization
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                dp[i][j] = -1; // Initialize dp[i][j] to -1 for the memoization approach
            }
        }
        System.out.println("Edit Distance (Memoization): " + ed.editDistanceMemo(word1, word2, n1, n2, dp));

        // Using Dynamic Programming
        System.out.println("Edit Distance (DP): " + ed.editDistanceDP(word1, word2));
    }
}

