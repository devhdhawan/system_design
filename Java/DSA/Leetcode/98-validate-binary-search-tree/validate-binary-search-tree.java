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
    public List<Integer> solve(TreeNode root,List<Integer> list){
        if(root==null)
            return list;
        
        
        list=solve(root.left,list);
        list.add(root.val);
        list=solve(root.right,list);

        return list;
    }
    public boolean isValidBST(TreeNode root) {
        
        List<Integer> list=solve(root,new ArrayList<Integer>());

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
                return false;
        }
        return true;
    }
}