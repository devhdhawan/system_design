/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=-1001;
    public int solve(TreeNode root){
        if(root==null)
            return 0;

        int leftTreeSum= solve(root.left); // Get the sum from leftTree
        int rightTreeSum= solve(root.right);// Get the sum from rightTree

        int sum_all=root.val+leftTreeSum+rightTreeSum;// Add root value,left and right sum value
        int sum_left=root.val+leftTreeSum;
        int sum_right=root.val+rightTreeSum;

        ans=Math.max(ans,sum_all); // check if it is max path sum
        ans=Math.max(ans,sum_left);
        ans=Math.max(ans,sum_right);
        ans=Math.max(ans,root.val);
   
        return Math.max(root.val,root.val+Math.max(leftTreeSum,rightTreeSum));

    }
    public int maxPathSum(TreeNode root) {
        
        solve(root);

        return ans;
    }
}