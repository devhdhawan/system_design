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
    public TreeNode solve(TreeNode root,int[] nums,int start,int end){
        
        if(start>end)
            return null;
        int mid=(start+end)/2;
        

        root=new TreeNode(nums[mid]);

        root.left=solve(root.left,nums,start,mid-1);
        root.right=solve(root.right,nums,mid+1,end);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int size=nums.length;
        
        return solve(new TreeNode(),nums,0,size-1);
    }
}