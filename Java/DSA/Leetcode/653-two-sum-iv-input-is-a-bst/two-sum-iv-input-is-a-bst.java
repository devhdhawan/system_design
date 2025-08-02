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
    Stack<TreeNode> stNext=new Stack<>();
    Stack<TreeNode> stBefore = new Stack<>();
    Solution(){

    }
    Solution(TreeNode root){
        TreeNode node=root;
        this.stNext.push(root);
        this.stBefore.push(root);

        while(root.left!=null){
            this.stNext.push(root.left);
            root=root.left;
        }
        root=node;
        while(root.right!=null){
            this.stBefore.push(root.right);
            root=root.right;
        }
    }

    public int next(){
        TreeNode root=this.stNext.pop();
        int val=root.val;
        
        if(root.right!=null){
            this.stNext.push(root.right);
            root=root.right;

            while(root.left!=null){
                this.stNext.push(root.left);
                root=root.left;
            }
        }

        return val;
    }

    public  int before(){
        TreeNode root=this.stBefore.pop();
        int val=root.val;

        if(root.left!=null){
            this.stBefore.push(root.left);
            root=root.left;

            while(root.right!=null){
                this.stBefore.push(root.right);
                root=root.right;
            }
        }

        return val;
    }
    public boolean findTarget(TreeNode root, int k) {
        Solution obj = new Solution(root);

        int left=obj.before();
        int right=obj.next();

        while(!obj.stNext.isEmpty() && !obj.stBefore.isEmpty()){
                

                if(left!=right && (left+right)==k)
                    return true;
                else if((left+right)>k){
                    left=obj.before();
                }else{
                    right=obj.next();
                }
        }
        return false;
    }
}