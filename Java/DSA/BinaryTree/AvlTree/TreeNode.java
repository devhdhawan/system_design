package DSA.BinaryTree.AvlTree;

public class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    int height;

    TreeNode(){

    }

    TreeNode(int key){
        this.key=key;
        this.left=null;
        this.right=null;
        this.height=1;
    }
}
