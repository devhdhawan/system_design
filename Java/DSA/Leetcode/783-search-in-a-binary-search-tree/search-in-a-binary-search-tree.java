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
    boolean flag=false;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        
        if(root.val==val){
            flag=true;
            return root;
        }
        TreeNode node=new TreeNode();
        if(!flag)
            node=searchBST(root.left,val);
        
        if(!flag)
            node=searchBST(root.right,val);

        return node;
    }
}