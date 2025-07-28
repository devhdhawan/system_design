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
 class Pair{
    TreeNode node;
    int row;

    Pair(TreeNode node,int row){
        this.node=node;
        this.row=row;
    }

    public int getRow(){
        return this.row;
    }

    public TreeNode getNode(){
        return this.node;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        if(root==null)
            return ans;
        Queue<Pair> queue = new LinkedList<>();


        queue.add(new Pair(root,0));
        int curr_row=0;

        while(!queue.isEmpty()){
            Pair p=queue.poll(); //Take the front node;
            
            TreeNode node=p.getNode();
            int row=p.getRow();
            
            if(curr_row!=row){
                ans.add(tmp);
                tmp=new ArrayList<>();
                curr_row=row;
                
            }

            tmp.add(node.val);

            if(node.left!=null){
                queue.add(new Pair(node.left,row+1));
            }

            if(node.right!=null){
                queue.add(new Pair(node.right,row+1));
            }
        }
        ans.add(tmp);
        return ans;
    }
}