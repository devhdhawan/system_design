package DSA.BinaryTree;
class Node{
    int key;
    Node left,right;

    Node(){

    }
    Node(int key){
        this.key=key;
        left=right=null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(Node root){
        this.root = root;
    }

    Node insert_record(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }

        if(key<root.key){
            root.left=insert_record(root.left,key);
        }else if(key>root.key){
            root.right=insert_record(root.right, key);
        }

        return root;
    }

    void inorder_traversal(Node root){
        if(root==null){
            return ;
        }

        inorder_traversal(root.left);
        System.out.print(root.key + " ");
        inorder_traversal(root.right);

    }
}

public class BinaryTreeImplementation {
    public static void main(String[] args) {
        Node root = new Node();
        root=null;
        BinaryTree tree = new BinaryTree(root);


        tree.root=tree.insert_record(tree.root,50);
        tree.root=tree.insert_record(tree.root,30);
        tree.root=tree.insert_record(tree.root,20);
        tree.root=tree.insert_record(tree.root,40);
        tree.root=tree.insert_record(tree.root,70);
        tree.root=tree.insert_record(tree.root,60);
        tree.root=tree.insert_record(tree.root,80);

        System.out.println("Inorder Traversal of the Binary Tree:");
        tree.inorder_traversal(tree.root);
    }
}