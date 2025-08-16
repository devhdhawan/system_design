package DSA.DP;
// Longest Common Subsequence
// This implementation finds the length of the longest common subsequence between two strings.
// Time Complexity: O(n1 * n2) where n1 and n2 are the lengths of the two strings
// Space Complexity: O(n1 * n2) for the dp array
// Time Complexity: O(n1 * n2) for the memoization approach
// Space Complexity: O(n1 * n2) for the memoization approach

public class LongestCommonSubsequence {
    public int lcsMemoDP(String text1,String text2,int i,int j,int n1,int n2,int[][] dp){
        if(i>=n1 || j>=n2)
            return 0;
        // If the result is already computed, return it
        if(dp[i][j]!=-1)
                return dp[i][j];
        
        // If characters match, move to the next characters in both strings
        // Otherwise, move to the next character in either string
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+lcsMemoDP(text1,text2,i+1,j+1,n1,n2,dp);
        }

        return dp[i][j]=Math.max(lcsMemoDP(text1,text2,i+1,j,n1,n2,dp),lcsMemoDP(text1,text2,i,j+1,n1,n2,dp));
    }

    public int lcsDP(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();

        int[][] dp = new int[n1+1][n2+1];

        // Initialize the first row and column to 0
        for(int i=0;i<=n2;i++){
           dp[0][i]=0;
        }


        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                // If characters match, increment the count from the previous characters
                // Otherwise, take the maximum from either excluding the current character of text1 or text2
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String text1 = "abcde";
        String text2 = "ace";

        // Using Memoization
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                dp[i][j] = -1; // Initialize dp[i][j] to -1 for the memoization approach
            }
        }
        System.out.println("Length of LCS (Memoization): " + lcs.lcsMemoDP(text1, text2, 0, 0, n1, n2, dp));

        // Using Dynamic Programming
        System.out.println("Length of LCS (DP): " + lcs.lcsDP(text1, text2));
    }
}
