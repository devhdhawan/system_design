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
        // Insert a new node with the given value into the BST
        if(this.root==null){
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
        }
        return this.root;
    }

    public void inorder(TreeNode root){
        // Traverse the left subtree, visit the node, and then traverse the right subtree
        if(root==null)
            return;

        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }

    public void preorder(TreeNode root){
        // Visit the node, traverse the left subtree, and then traverse the right subtree
        if(root==null)
            return;

        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root){
        // Traverse the left subtree, traverse the right subtree, and then visit the node
        if(root==null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }

    public TreeNode inorderSuccessor(TreeNode node){
        // Find the minimum value node in the right subtree
        if(node==null)
            return null;

        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    
    public TreeNode deleteNode(TreeNode root,int value){
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
    }
    public void deleteNode(TreeNode root,int value){
        TreeNode node=findNode(root, value);

        if(node==null){
            System.out.println("No Matching Key Found");
        }else{
            // Node with only one child or no child
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            
            TreeNode minNode=root.right;
            TreeNode inorderSuccessor=inorderSuccessor(minNode);

            root.value=inorderSuccessor.value;
            root.right=deleteNode(root.right, inorderSuccessor.value);
        }
        return root;
    }

    public TreeNode updateNode(int oldValue, int newValue) {
        // First delete the node with oldValue and then insert the newValue
        TreeNode node = deleteNode(root, oldValue);
        node= insert(newValue);
        return node;
    }
    public static void main(String[] args){
        BST obj=new BST();
        TreeNode root;
        // Inserting nodes
        root=obj.insert(30);
        root=obj.insert(20);
        root=obj.insert(45);
        root=obj.insert(42);
        root=obj.insert(11);
        root=obj.insert(55);
        root=obj.insert(13);

        System.out.print("Inorder:");
        obj.inorder(root);
        System.out.println();

        // Deleting a node
        int deleteValue = 20;
        System.out.println("Deleting node with value: " + deleteValue);
        root=obj.deleteNode(root, 20);
        System.out.print("Inorder after deletion:");
        obj.inorder(root);

        // Updating a node
        int oldValue = 42;
        int newValue = 50;
        System.out.print("\nUpdating node with value " + oldValue + " to "  + newValue);
        root=obj.updateNode(42, 50);
        System.out.print("\nInorder after updating:");
        obj.inorder(root);
        System.out.println();


    }
}


