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
    Map<Integer,Integer> mp=new HashMap<>();
    public TreeNode solve(TreeNode root,int[] preorder,Solution obj,int preStart,int preEnd,int inStart,int inEnd){
        if(preStart>preEnd)
            return null;
        if(inStart>inEnd)
            return null;
        
        int inIndex=obj.mp.get(preorder[preStart]);
        int diff=inIndex-inStart;
        int preIndex=diff+preStart;

        root=new TreeNode(preorder[preStart]);

        root.left=solve(root.left,preorder,obj,preStart+1,preIndex,inStart,inIndex-1);
        root.right=solve(root.right,preorder,obj,preIndex+1,preEnd,inIndex+1,inEnd);

        return root;
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        Solution obj=new Solution();
        int[] inorder=new int[preorder.length];

        for(int i=0;i<preorder.length;i++)
            inorder[i]=preorder[i];
        
        Arrays.sort(inorder);

        for(int i=0;i<inorder.length;i++){
            obj.mp.put(inorder[i],i);
        }

        
        return solve(new TreeNode(),preorder,obj,0,preorder.length-1,0,inorder.length-1);

    }
}