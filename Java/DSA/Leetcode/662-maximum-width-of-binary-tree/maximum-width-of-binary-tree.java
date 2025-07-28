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
    int col;

    Pair(TreeNode node,int row,int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
    public int getRow(){
        return this.row;
    }

    public TreeNode getNode(){
        return this.node;
    }

    public int getColumn(){
        return this.col;
    }

 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Map<Integer,ArrayList<Integer>> mp = new HashMap<>();
        Queue<Pair> queue=new LinkedList<>();

        queue.add(new Pair(root,0,0));
        int max_row=0;

        while(!queue.isEmpty()){
            Pair p=queue.poll();

            int index=p.getColumn();
            int left_index=index*2+1;
            int right_index=index*2+2;

            int row=p.getRow();
            TreeNode node=p.getNode();

            if(row>max_row)
                max_row=row;

            mp.computeIfAbsent(row,k -> new ArrayList<>()).add(index);

            if(node.left!=null){
                queue.add(new Pair(node.left,row+1,left_index));
            }

            if(node.right!=null){
                queue.add(new Pair(node.right,row+1,right_index));
            }
        }

        int max_width=0;

        for(Map.Entry<Integer,ArrayList<Integer>> entry : mp.entrySet()){
            Collections.sort(entry.getValue());
            int len=entry.getValue().size();
            int l=entry.getValue().get(0);
            int h=entry.getValue().get(len-1);

            if(max_width<(h-l+1))
                max_width=h-l+1;
        }
        return max_width;
    }
}