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
    Integer level;

    Pair(TreeNode node,Integer level){
        this.node=node;
        this.level=level;
    }

    public Integer getLevel(){
        return level;
    }

    public TreeNode getNode(){
        return node;
    }



 }
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> bufferList= new ArrayList<>();
        if(root==null)
            return ans;
        boolean flag=true;
        Queue<Pair> queue = new LinkedList<>();
        int level=1;

        queue.add(new Pair(root,level));

        while(!queue.isEmpty()){
            Pair p=queue.poll();

            if(level!=p.level){
                if(!flag){
                    Collections.reverse(bufferList);
                    flag=true;
                }else{
                    flag=false;
                }

                ans.add(bufferList);
                bufferList=new ArrayList<>();
                level++;

                
            }

            bufferList.add(p.node.val);

            
            if(p.node.left!=null){
                queue.add(new Pair(p.node.left,p.level+1));
            }
            
            if(p.node.right!=null){
                queue.add(new Pair(p.node.right,p.level+1));
            }
            

            
        }
        
        if(!flag)
            Collections.reverse(bufferList);
        ans.add(bufferList);
        return ans;
    }
}