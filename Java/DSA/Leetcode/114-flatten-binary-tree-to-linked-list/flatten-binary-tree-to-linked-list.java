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
    
    public List<TreeNode> solve(TreeNode root,List<TreeNode> preOrder){
        if(root==null)
            return preOrder;
        
        preOrder.add(root);
        preOrder=solve(root.left,preOrder);
        preOrder=solve(root.right,preOrder);

        return preOrder;
    }
    public void flatten(TreeNode root) {
        List<TreeNode> preOrder= new ArrayList<>();

        preOrder=solve(root,preOrder);
        
        boolean rootFlag=true;
        TreeNode prevNode=new TreeNode();
        for(TreeNode node:preOrder){
            if(rootFlag){
                rootFlag=false;
                root=node;
            }else{
                prevNode.right=node;
                prevNode.left=null;
            }
            prevNode=node;
        }

    }
}