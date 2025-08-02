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
    int maxDiameter=0;
    
    public int solve(TreeNode root){
        if(root==null)
            return 0;
        
        int left=solve(root.left);
        int right=solve(root.right);

        maxDiameter=Math.max(left+right,maxDiameter);

        int height=Math.max(left,right);
        return height+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        
        int height=solve(root);

        return maxDiameter;

    }
}