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
    public int calHeight(TreeNode root,boolean[] tree_balance){
        if(root==null) 
            return 0;

        if(!tree_balance[0])
            return 0;
        
        
        int left=calHeight(root.left,tree_balance);
        int right=calHeight(root.right,tree_balance);

        if(Math.abs(left-right)>1)
        {
            tree_balance[0]=false;
            return 0;
        }
        
        return Math.max(left,right)+1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root ==  null)
            return true;

        boolean[] tree_balance={true};
        calHeight(root,tree_balance);
      

        return tree_balance[0];
    }
}