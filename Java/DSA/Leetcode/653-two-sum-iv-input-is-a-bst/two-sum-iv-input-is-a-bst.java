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
    public boolean findTarget(TreeNode root, int k) {
        Solution obj=new Solution();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node=queue.poll();

            obj.mp.put(node.val,1);
            if(node.left!=null){
                queue.add(node.left);
            }

            if(node.right!=null){
                queue.add(node.right);
            }
        }

        for(Map.Entry<Integer,Integer> entry:obj.mp.entrySet()){
            int value=k-entry.getKey();
            int key=entry.getKey();
            obj.mp.put(key,0);
            if(obj.mp.containsKey(value)){
                if(obj.mp.get(value)==1)
                return true;
            }
            obj.mp.put(key,1);
        }
        return false;
    }
}