package DSA.BinaryTree.AvlTree;



public class AvlTreeImplementation {
     public int balancingFactor(TreeNode root){
        if(root==null)
            return 0;

        return height(root.left)-height(root.right);

    }

    public int height(TreeNode root){
        if(root==null)
            return 0;
        
        return root.height;
    }
    public TreeNode rightRotation(TreeNode node){
        TreeNode root=node.left;
        TreeNode prevRootRight=node.right;

        root.right=node;
        node.left=prevRootRight;

        root.height=1+Math.max(height(root.left),height(root.right));
        node.height=1+Math.max(height(node.left),height(node.right));

        return root;
    }

    public TreeNode leftRotation(TreeNode node){
        TreeNode root=node.right;
        TreeNode rootLeft = root.left;

        root.left=node;
        node.right=rootLeft;
        
        root.height=1+Math.max(height(root.left),height(root.right));
        node.height=1+Math.max(height(node.left),height(node.right));

        return root;
    }

    public TreeNode insertNode(TreeNode root,int key){
        if(root==null){
            root=new TreeNode(key);
            return root;
        }else{
            if(key<root.key){
                root.left=insertNode(root.left,key);
            }else if(key>root.key){
                root.right=insertNode(root.right,key);
            }
            
            root.height=1+Math.max(height(root.left),height(root.right));
            int balance=balancingFactor(root);

            if(balance>1 && key<root.left.key){
                //left-left rotation
                return rightRotation(root);
            }
            if(balance>1 && key>root.left.key){
                //left-right rotation
                root=leftRotation(root.left);
                return rightRotation(root);
            }
            if(balance<-1 && key>root.right.key){
                //right-right rotation
                return leftRotation(root);
            }
            if(balance<-1 && key<root.right.key){
                //right=left rotation
                root=rightRotation(root.right);
                return leftRotation(root);
            }
        }
        return root;
    }
    //search
    public TreeNode searchNode(TreeNode root,int value){
        if(root==null)
            return null;

        if(root.key==value)
            return root;
        
        if(value<root.key)
            root=searchNode(root.left, value);
        else if(value>root.key)
            root=searchNode(root.right, value);
        
        return root;
    }

    //delete Node
    public TreeNode findInorderSuccessor(TreeNode root){
        if(root==null)
            return root;
        
        while(root.left!=null)
            root=root.left;
        return root;
    }
    public TreeNode deleteNode(TreeNode root,int value){
        
        if(value<root.key){
            root.left=deleteNode(root.left, value);

        }
        else if(value>root.key){
            root.right=deleteNode(root.right, value);
        }
        else{
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            
            TreeNode inorderSuccessor=findInorderSuccessor(root.right);
            root.key=inorderSuccessor.key;
            root=deleteNode(root.right,inorderSuccessor.key);

        }
        int balance=balancingFactor(root);

        
        return root;
    }
    //Traversal
    public void inorder(TreeNode root){
        if(root==null)
            return ;
        inorder(root.left);
        System.out.print(root.key+" "); 
        inorder(root.right);        
        
    }

    public void preorder(TreeNode root){
        if(root==null)
            return ;
        System.out.print(root.key+" "); 
        preorder(root.left);
        preorder(root.right);        
        
    }

    public void postorder(TreeNode root){
        if(root==null)
            return ;

        postorder(root.left);
        postorder(root.right);     
        System.out.print(root.key+" ");    
        
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode();
        AvlTreeImplementation obj=new AvlTreeImplementation();

        root=obj.insertNode(root, 3);
        root=obj.insertNode(root, 2);
        root=obj.insertNode(root, 1);

        System.out.print("Inorder:");
        obj.inorder(root);
        System.out.print("\nPreorder:");
        obj.preorder(root);
        System.out.print("\nPostorder");
        obj.postorder(root);

        //Search Node
        int value=2;
        TreeNode node=obj.searchNode(root, value);
        if(node!=null)
        System.out.print("\nWe have found the node with value:"+node.key);args

        // delete node
        int delValue=2;

        


    }
}
