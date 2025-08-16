package DSA.DP;
// Longest Increasing Subsequence
// This implementation finds the length of the longest increasing subsequence in an array.
// Time Complexity: O(n^2) where n is the number of elements in the array
// Space Complexity: O(n) for the dp array

public class LongestIncreasingSubsequence {
    public static int lengthOfLISRec(int[] nums, int[][] dp, int index, int prevIndex, int n) {
        if (index == n) return 0;
        
        if (dp[index][prevIndex+1] != -1) return dp[index][prevIndex+1];
        // Option 1: Do not take the current element
        int notTake = lengthOfLISRec(nums, dp, index + 1, prevIndex, n);
        int take = 0;

        // Option 2: Take the current element if it is greater than the previous element
        // or if it is the first element (prevIndex == -1)
        if (prevIndex == -1 || nums[index] > nums[prevIndex]) {
            take = 1 + lengthOfLISRec(nums, dp, index + 1, index, n);
        }

        dp[index][prevIndex+1] = Math.max(take, notTake);
        return dp[index][prevIndex+1];
        
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int[] dp = new int[n];
        int ans=0;

        for(int i=0;i<n;i++){
            dp[i] = -1; // Initialize dp[i] to -1 to indicate unvisited
        }

        for(int i=0;i<n;i++){
            if(dp[i]==-1)
                dp[i] = 1; // Initialize dp[i] to 1 if not already set
            for(int j=i+1;j<n;j++){
                if(nums[j] > nums[i]) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                    ans=Math.max(ans,dp[j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        System.out.println("Length of Longest Increasing Subsequence: " + lengthOfLIS(nums));
        // For recursive approach
        int[][] dp= new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                dp[i][j] = -1; // Initialize dp[i][j] to -1 for the recursive approach
            }
            
        }
        System.out.println("Length of Longest Increasing Subsequence (Recursive): " + lengthOfLISRec(nums, dp, 0, -1, nums.length));
    }
}
