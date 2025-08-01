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
class BSTIterator {
    TreeNode root=new TreeNode();
    Stack<TreeNode> stack=new Stack<>();
    public BSTIterator(TreeNode root) {
        TreeNode node=root;

        this.stack.push(node);
        while(node.left!=null){
            this.stack.push(node.left);
            node=node.left;
        }
    }
    
    public int next() {
        if(this.stack.isEmpty()==true)
            return -1;
        TreeNode node=this.stack.peek();
        int val=node.val;
        this.stack.pop();

        if(node.right!=null){
            this.stack.push(node.right);
            node=node.right;
            while(node.left!=null){
                this.stack.push(node.left);
                node=node.left;
            }
        }
        
        return val;
    }
    
    public boolean hasNext() {
        if(this.stack.isEmpty()!=true)
            return true;
        
        // TreeNode node=this.stack.peek();

        // if(node.right!=null)
        //     return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */