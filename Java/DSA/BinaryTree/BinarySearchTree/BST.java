package DSA.BinaryTree.BinarySearchTree;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(){
    }
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class BST {
    private TreeNode root;

    public TreeNode insert(int value){
            if(root==null){
                TreeNode node=new TreeNode(value);
                this.root=node;
            }else{
                TreeNode node=this.root;
                
                while(true){
                    if(node.value<value){
                        if(node.right==null){
                            node.right=new TreeNode(value);
                            break;
                        }
                        else
                            node=node.right;
                    }else{
                        if(node.left==null){
                            node.left=new TreeNode(value);
                            break;
                        }
                        else
                            node=node.left;
                    }
                }
            }
        return this.root;
    }

    public void inorder(TreeNode root){
        if(root==null)
            return;

        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }

    public void preorder(TreeNode root){
        if(root==null)
            return;

        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root){
        if(root==null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }

    public TreeNode findNode(TreeNode root,int value){
        if(root==null)
            return null;
        
        if(root.value==value)
            return root;
        
        TreeNode left=findNode(root.left,value);
        TreeNode right=findNode(root.right,value);

        if(left!=null)
            return left;
        if(right!=null)
            return right;
        
        return null;
        
    }
    public TreeNode setProp(TreeNode node,int value){
        if(root==null)
            return null;
        if(node.right!=null && node.right.value>value){
                int v=node.right.value;
                node.right.value=node.value;
                node.value=v;
                setProp(node.right,value);
            }
        if(node.left!=null && node.left.value>value){
                int v=node.left.value;
                node.left.value=node.value;
                node.value=v;
                setProp(node.left,value);
            }
        return node;
    }
    public void deleteNode(TreeNode root,int value){
        TreeNode node=findNode(root, value);

        if(node==null){
            System.out.println("No Matching Key Found");
        }else{
            setProp(node,value);
        }
        
    }
    public static void main(String[] args){
        BST obj=new BST();
        TreeNode root;
        root=obj.insert(30);
        root=obj.insert(20);
        root=obj.insert(45);
        root=obj.insert(42);
        root=obj.insert(11);
        root=obj.insert(55);
        root=obj.insert(13);

        System.out.print("Inorder:");
        obj.inorder(root);
        System.out.println("");
        System.out.print("Preorder:");
        obj.preorder(root);
        System.out.println("");
        System.out.print("Postorder:");
        obj.postorder(root);


    }
}


