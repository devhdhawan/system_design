/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String data="";

        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
            data=data+root.val+" ";
        }

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if(node!=null)
                

            if(node.left!=null){
                queue.add(node.left);
                data=data+node.left.val+" ";
            }
            
            if(node.left==null)
                data=data+"N"+" ";
            
            if(node.right!=null){
                queue.add(node.right);
                data=data+node.right.val+" ";
            }
            
            if(node.right==null)
                data=data+"N"+" ";
        }
        
        return data;
    }

    // Decodes your encoded data to tree.
   
    public TreeNode deserialize(String data) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list= new ArrayList<>();
        TreeNode root=new TreeNode();
        String[] nodes=data.split(" ");

        for(String node:nodes){
            TreeNode nod;
            
            if(node.equals("N")==false && node.equals("")==false){
                int val=Integer.parseInt(node);
                nod=new TreeNode(val);
            }else{
                nod=null;
            }
            list.add(nod);
        }

        boolean leftTurn=true;
        boolean rightTurn=false;
        for(int i=0;i<list.size();i++){
            TreeNode node=list.get(i);

            if(i==0){
                root=node;
                queue.add(root);
            }else{
                TreeNode frontNode=queue.peek();

                if(leftTurn==true){
                    frontNode.left=node;
                    rightTurn=true;
                    leftTurn=false;
                }else if(rightTurn==true){
                    frontNode.right=node;
                    queue.poll();
                    rightTurn=false;
                    leftTurn=true;
                }
                
                if(node!=null)
                    queue.add(node);
                
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));